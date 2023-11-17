package com.example.ppactic

import android.content.Intent
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton

class Registration : AppCompatActivity() {
    private lateinit var qoLooperPage : AppCompatButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registration)
        qoLooperPage = findViewById(R.id.buttonq)
        qoLooperPage.setOnClickListener{
            Log.e("XUI", "прошел ивент")
            val intent = Intent (this, Autorization ::class.java)
            startActivity(intent)
            finish() }
    }

}
