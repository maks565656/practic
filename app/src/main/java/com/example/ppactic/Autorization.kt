package com.example.ppactic

import android.content.Intent
import android.os.Bundle
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatImageButton

class Autorization :  AppCompatActivity(){
    private lateinit var qoLooperPage : AppCompatButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.autorization)
        qoLooperPage = findViewById(R.id.button1)
        qoLooperPage.setOnClickListener{
            val intent = Intent (this@Autorization, Registration ::class.java)
            startActivity(intent)
            finish()
        }

    }
}