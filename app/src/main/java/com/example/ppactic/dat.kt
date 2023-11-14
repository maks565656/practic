package com.example.ppactic

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.os.strictmode.SqliteObjectLeakedViolation
import android.provider.ContactsContract.CommonDataKinds.Email
import java.security.cert.CertificateFactory
import java.sql.SQLClientInfoException

class dat (val context: Context, val factory: SQLiteDatabase.CursorFactory?) :
    SQLiteOpenHelper(context, "pril", factory, 1){
    override fun onCreate(db: SQLiteDatabase?) {
val quare = "CREATE TABLE users (id INI PRIMARY KEY, login TEXT, email TEXT, password TEXT)"
        db!!.execSQL(quare)

    }

    override fun onUpgrade(db: SQLiteDatabase?, p1: Int, p2: Int) {
       db!!.execSQL("DROP TABLE IF EXISTS users")
        onCreate(db)
    }
    fun addUser (user: User) {
        val values = ContentValues()
        values.put("email", user.email)
        values.put("login", user.login)
        values.put("password", user.password)

        val db = this.writableDatabase
        db.insert("users", null, values)
        db.close()
    }
    fun getUser(email: String, password: String): Boolean {
        val db = this.readableDatabase
        val result = db.rawQuery("SELECT * FROM user WHERE email = '$email' AND password = '$password'", null)
        return result.moveToFirst()
    }
}