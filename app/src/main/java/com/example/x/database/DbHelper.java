package com.example.x.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {
public static final String dbName ="dataX";

    public DbHelper(@Nullable Context context) {
        super(context, dbName, null, 8);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String tbType = "CREATE TABLE type (\n" +
                "    id   INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
                "    name TEXT    NOT NULL\n" +
                ");";
        db.execSQL(tbType);
        String dataType = "insert into type values (1,'Phòng Đơn'),(2,'Phòng Đôi'),(3,'Phòng Gia Đình')";
        db.execSQL(dataType);
        String tbRoom = "CREATE TABLE room (\n" +
                "    id     INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
                "    idType INTEGER REFERENCES type (id) \n" +
                "                   NOT NULL,\n" +
                "    number INTEGER NOT NULL,\n" +
                "    status INTEGER NOT NULL,\n" +
                "    price  INTEGER NOT NULL\n" +
                ");";
        db.execSQL(tbRoom);
        String tbCustomer = "CREATE TABLE customer (\n" +
                "    id    INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
                "    name  TEXT    NOT NULL,\n" +
                "    phone TEXT    NOT NULL,\n" +
                "    email TEXT,\n" +
                "    birth INTEGER NOT NULL\n" +
                ");";
        db.execSQL(tbCustomer);
        String tbReceptionist = "CREATE TABLE receptionist (\n" +
                "    id       INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
                "    name     TEXT    NOT NULL,\n" +
                "    email    TEXT,\n" +
                "    username TEXT    NOT NULL\n" +
                "                     UNIQUE,\n" +
                "    password TEXT    NOT NULL\n" +
                ");";
        db.execSQL(tbReceptionist);
        String dataReceptionist ="insert into receptionist values (1,'Nguyễn Ngọc Linh','linhruoifly1@gmail.com','admin','admin')";
        db.execSQL(dataReceptionist);
        String tbService = "CREATE TABLE service (\n" +
                "    id       INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
                "    name     TEXT    NOT NULL,\n" +
                "    price    INTEGER NOT NULL\n" +
                ");";
        db.execSQL(tbService);
        String tbBill = "CREATE TABLE bill (\n" +
                "    id             INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
                "    idCustomer       INTEGER REFERENCES customer (id) \n" +
                "                           NOT NULL,\n" +
                "    idReceptionist INTEGER REFERENCES receptionist (id) \n" +
                "                           NOT NULL,\n" +
                "    idService      INTEGER REFERENCES service (id),\n" +
                "    checkIn        TEXT,\n" +
                "    checkOut       TEXT,\n" +
                "    realCheckOut   TEXT,\n" +
                "    costRoom       INTEGER NOT NULL,\n" +
                "    costService       INTEGER,\n" +
                "    VAT            INTEGER NOT NULL,\n" +
                "    status         INTEGER NOT NULL,\n" +
                "    sumCost        INTEGER NOT NULL\n" +
                ");";
        String tbHardBill = "CREATE TABLE hardBill (\n" +
                "    id             INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
                "    idBill         INTEGER REFERENCES bill (id),\n" +
                "    idRoom         INTEGER REFERENCES room (id),\n" +
                "    quantityPeople INTEGER NOT NULL\n" +
                ");\n";
        db.execSQL(tbHardBill);
        db.execSQL(tbBill);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists type");
        db.execSQL("drop table if exists room");
        db.execSQL("drop table if exists customer");
        db.execSQL("drop table if exists receptionist");
        db.execSQL("drop table if exists service");
        db.execSQL("drop table if exists bill");
        db.execSQL("drop table if exists hardBill");
        onCreate(db);
    }
}
