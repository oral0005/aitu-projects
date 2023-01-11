import random

print('Приветствую!')
print('')


s = 1

while s == 1:
    print('Начать-введите 1')
    print('Выйти-введите 2')
    a = int(input('Ввод:'))


    if a == 1:
        while a == 1:
            print('Выставка оценок по списку-введите 1')
            print('Выставка оценок по рандому списку-введите 2')
            print('Выйти-введите 3')


            p = int(input('Что хотите сделать?:'))
            if p == 3:
                break

            num = int(input('Количество студентов:'))

            students = []

            for i in range (0 , num):
                students.append(input (f"Студент {i + 1} = "))

                
            

            if p == 1:

                


                for i in range (0 , num):
                
                
                    print (students[i])



                    x = input()


                    if x == 'Общая оценка':
                        g = input('Общая оценка:')
                        break

                    elif x == 'Стоп':
                        break

                    else: 
                        students[i] = students[i]+' '+x

                        
                    
                for i in range (0,num):
                    if x == 'Общая оценка':
                        print(students[i],g)
                    else:
                        print (students[i])

                print('Оценка завершена!')

            elif p == 2:

                random.shuffle(students)
                
                for i in range (0 , num):
                
                
                    print (students[i])



                    x = input()


                    if x == 'Общая оценка':
                        g = input('Общая оценка:')
                        break

                    elif x == 'Стоп':
                        break

                    else: 
                        students[i] = students[i]+' '+x

                        
                    
                for i in range (0,num - 1):
                    if x == 'Общая оценка':
                        print(students[i],g)
                    else:
                        print (students[i])

                print('Оценка завершена!')

    elif a == 2:
        print('До свидания!')
        break
        

    else :
        print('Простите такой команды нет, попробуйте еще раз.')





