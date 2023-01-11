import sqlite3
#1)Осылай база данныхпен қостым
with sqlite3.connect("database.db") as db:
    cursor = db.cursor()
#2)Тип данных енгіздім
    cursor.execute("""CREATE TABLE articles(
        id INTEGER PRIMARY KEY AUTOINCREMENT,
        brand VARCHAR,
        model VARCHAR,
        years VARCHAR,
        price BIGINT
        )""")
#3)База данныхқа сақталатын переменныйлар жаздым
    values = [
            ("BMW", "M5", "2022", "100000"),
            ("MERCEDES", "S-CLASS", "2021", "200000"),
            ("TOYOTA", "CAMRY", "2020", "20000"),
            ("NISSAN", "MURANO", "2016", "10000")
        ]
#4)База данныхқа енгіздім
    cursor.executemany("INSERT INTO articles(brand,model,years,price) VALUES(?,?,?,?)", values)
#5)Консольға данныйларды шығардым
    cursor.execute("SELECT * FROM articles ")
    print(cursor.fetchall())
#6)Көліктің бағасын өзгерту
    print("Change car's price")
    num = int(input("Enter cars id number:"))
    pri = int(input("Enter your new price:"))

    cursor.execute("UPDATE articles SET price = ? WHERE id = ?", [pri, num])
#7) Консольға данныйларды шығардым
    cursor.execute("SELECT * FROM articles ")
    print(cursor.fetchall())
#8)Көлікті алып тастадым

    print("Delete car")
    num1 = int(input("Enter cars id number:"))
#9) Консольға данныйларды шығардым
    cursor.execute("DELETE from articles WHERE id = ?",[num1])
    cursor.execute("SELECT * FROM articles ")
    print(cursor.fetchall())
