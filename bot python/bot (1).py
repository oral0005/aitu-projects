import telebot
from telebot import types
import random

# https://t.me/listscore_bot

bot = telebot.TeleBot('5881343723:AAEapQg7QJHxLMacPs7pyjt6o_STA2_SO0E')

students = ['Дархан','Бексултан','Батырхан','Алинур', 'Багдат','Али', 'Ернур','Алинур', 'Алихан','Султан']
random.shuffle(students)

counterAttendance = 1
counterAbsent = 1

attendance = [0] * 21
absent = [0] * 21

curr = 0
scena = 1
total = 0

n = 0
k = 0


class mess:
    def __init__(self, chat, text):
        self.chat = chat
        self.text = text





def message_handler(chat_id=0, text=0):
    global curr, scena, total, counterAbsent, counterAttendance, n, k

    if (curr == len(students) and scena != 4):
        markup = types.ReplyKeyboardMarkup(resize_keyboard=True)
        btn1 = types.KeyboardButton("Посмотреть оценки")
        btn2 = types.KeyboardButton("Кто не пришел?")

        markup.add(btn1, btn2)
        scena = 4
        bot.send_message(chat_id, "Что хотите сделать?", reply_markup=markup)
        return

    if (scena == 4):
        if (text == "Посмотреть оценки"):
            if n == 0:
                bot.send_message(chat_id, "В группе никого нету")
            else:
                while total < n + 1:
                    bot.send_message(chat_id, f" {attendance[total]} - {attendance[total + 1]}")
                    counterAttendance += 1
                    total += 2

        elif text == "Кто не пришел?":
            if k == 0:
                bot.send_message(chat_id, "Все пришли")

            else:
                for i in range(k):
                    bot.send_message(chat_id, f"{counterAbsent}) {absent[i]}")
                    counterAbsent += 1


    if scena == 1:

        markup = types.ReplyKeyboardMarkup(resize_keyboard=True)
        btn1 = types.KeyboardButton("Да")
        btn2 = types.KeyboardButton("Нет")
        markup.add(btn1, btn2)
        text = ""
        bot.send_message(chat_id, text=f"{students[curr]}. Он-(а) присутствует?", reply_markup=markup)
        scena = 2

    if scena == 3:
        attendance[n] = int(text)
        n += 1
        bot.send_message(chat_id, text="Оценен")
        scena = 1
        text = ""
        message_handler(chat_id, text)

    if scena == 2 and text == "Да":
        attendance[n] = students[curr]
        n += 1
        bot.send_message(chat_id, text="Какую оценку хотите поставить?")
        curr += 1
        text = ""
        scena = 3

    elif scena == 2 and text == "Нет":
        absent[k] = students[curr]
        k += 1
        curr += 1
        scena = 1
        text = ""
        message_handler(chat_id, text)


@bot.message_handler(commands=['start'])
def start(message):
    markup = types.ReplyKeyboardMarkup(resize_keyboard=True)
    btn = types.KeyboardButton("Начать")
    markup.add(btn)
    bot.send_message(message.chat.id,
                     text="Приветствую, {0.first_name}!".format(message.from_user), reply_markup=markup)

@bot.message_handler(content_types=['text'])
def func(message):
    message_handler(message.chat.id, message.text)

bot.polling(none_stop=True)