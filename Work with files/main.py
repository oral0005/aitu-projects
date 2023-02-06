import os

while True:
#Loop with interface
    print("0) Stop")
    print("1) Create file")
    print("2) Open file")
    print("3) Rename file")
    print("4) Delete file")

    c = int(input("Choose: "))

#Create file
    if c == 1:
        s = input("Write file name: ")
        s = s + ".txt"
        f = open(s,"x")


#Open file
    elif c == 2:
        s = input("Write file name: ")
        s = s + ".txt"
        f = open(s,"w")

        print("1) Add data")
        print("2) Read data")

        a = int(input("Choose: "))
#Add data
        if a == 1:
            st = input("Write data: ")
            f.writelines(st)
#Read data
        elif a == 2:
            f = open(s,"r")
            print(f.read())
#Rename file
    elif c == 3:
        str = input("Write file name: ")
        str1 = input("Write new name:")
        put = r"c:\users\orala\PycharmProjects\pythonProject\\"
        str = str + ".txt"
        str1 = str1 + ".txt"
        str = put + str
        str1 = put + str1
        os.rename(str,str1)
#Remove file
    elif c == 4:
        str = input("Write file name: ")
        str = str + ".txt"
        put =r"c:\users\orala\PycharmProjects\pythonProject\\"
        str = put + str
        os.remove(str)
#Stop
    elif c == 0:
        break





