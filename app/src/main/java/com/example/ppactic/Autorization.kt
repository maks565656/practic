package com.example.ppactic

import android.content.Intent
import android.os.Bundle
import android.os.Looper
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatImageButton

class Autorization :  AppCompatActivity() {
    private lateinit var qoLooperPage: AppCompatButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.autorization)
        qoLooperPage = findViewById(R.id.button1)
        qoLooperPage.setOnClickListener {
            val intent = Intent(this@Autorization, Registration::class.java)
            startActivity(intent)
            finish()
        }
        val emailEditText = findViewById<EditText>(R.id.editTextTextEmailAddress)
        val passwordEditText = findViewById<EditText>(R.id.editTextTextPassword)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val email = emailEditText.text.toString().trim()
            val password = passwordEditText.text.toString().trim()

            if (email =="" || password == "" )
                Toast.makeText(this, "не все поля заполненны", Toast.LENGTH_LONG).show()
            else{
         val db = dat(this, null)
                val isAuth = db.getUser(email, password)
                if (isAuth) {
                    true
                    Toast.makeText(this, "пользователь $email авторизован", Toast.LENGTH_LONG).show()
                    emailEditText.text.clear()
                    passwordEditText.text.clear()
                    qoLooperPage = findViewById(R.id.button1)
                    qoLooperPage.setOnClickListener {
                        val intent = Intent(this@Autorization, Creating_code::class.java)
                        startActivity(intent)
                        finish()}
                }else{
                    false
                    Toast.makeText(this, "пользователь $email не авторизован", Toast.LENGTH_LONG).show()
                }

            }
        }
    }
}