import sqlite3 as sql

#База данныхка костым
con = sql.connect('db_web.db')

cur = con.cursor()

cur.execute("DROP TABLE IF EXISTS users")

#Таблица курдым
sql ='''CREATE TABLE "users" (
	UID	INTEGER PRIMARY KEY AUTOINCREMENT,
	brand VARCHAR,
    model VARCHAR,
    years VARCHAR,
    price VARCHAR
)'''
cur.execute(sql)
#Переменныйлар енгиздим
values = [
            ("BMW", "M5", "2022", "100000"),
            ("MERCEDES", "S-CLASS", "2021", "200000"),
            ("TOYOTA", "CAMRY", "2020", "20000"),
            ("NISSAN", "MURANO", "2016", "10000"),
            ("HONDA", "CIVIC", "2008", "8000"),
            ("TOYOTA", "COROLLA", "2019", "13000"),
            ("MERCEDES", "E-CLASS", "2017", "19000"),
            ("BMW", "M3", "2000", "7000"),
        ]

cur.executemany("insert into users(brand,model,years,price) VALUES(?,?,?,?)", values)

con.commit()

con.close()