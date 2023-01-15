import sqlite3
#1)Осылай база данныхпен қостым
with sqlite3.connect("database.db") as db:
    cursor = db.cursor()
#2)Тип данных енгіздім
    cursor.execute("""CREATE TABLE articles(
        id INTEGER PRIMARY KEY AUTOINCREMENT,
        brand VARCHAR,
        model VARCHAR,
        years INTEGER,
        price BIGINT
        )""")
#3)База данныхқа сақталатын переменныйлар жаздым
    values = [
            ("BMW", "M5", 2022, 100000),
            ("MERCEDES", "S-CLASS", 2021, 200000),
            ("TOYOTA", "CAMRY", 2020, 20000),
            ("NISSAN", "MURANO", 2016, 10000),
            ("HONDA", "CIVIC", 2008, 8000),
            ("TOYOTA", "COROLLA", 2019, 13000),
            ("MERCEDES", "E-CLASS", 2017, 19000),
            ("BMW", "M3", 2000, 7000),
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
    cursor.execute("SELECT * FROM articles")
    print(cursor.fetchall())
#10) Машина издеу
    sear = input("Search a car:")
    cursor.execute("SELECT * FROM articles WHERE brand  = ? OR model = ?", [sear, sear])
    print(cursor.fetchall())
#11)Фильтр жылымен немесе багасымен
    print("1)filter by a year")
    print("2)filter by a price")
    filt = int(input("Choose how to filter:"))
    if filt == 1:
        filter1 = int(input("from:"))
        filter2 = int(input("before:"))
        cursor.execute("SELECT * FROM articles WHERE years >= ? AND years <= ?", [filter1, filter2])
        # cursor.execute("SELECT * FROM articles", [])
        print(cursor.fetchall())
    elif filt == 2:
        filter1 = int(input("from:"))
        filter2 = int(input("before:"))
        cursor.execute("SELECT * FROM articles WHERE price >= ? AND price <= ?", [filter1, filter2])
        print(cursor.fetchall())

#12)Сортировка Атымен, жылымен, багасымен
    print("1) SORT by brand")
    print("2) SORT by year")
    print("3) SORT by price")

    sort = int(input("Choose how to SORT:"))

    if sort == 1:
        cursor.execute("SELECT * FROM articles ORDER BY brand")
        print(cursor.fetchall())
    elif sort == 2:
        cursor.execute("SELECT * FROM articles ORDER BY years")
        print(cursor.fetchall())
    elif sort == 3:
        cursor.execute("SELECT * FROM articles ORDER BY price")
        print(cursor.fetchall())