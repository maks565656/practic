package com.example.ppactic

import android.content.Intent
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton

class Registration : AppCompatActivity() {
    private lateinit var qoLooperPage : AppCompatButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registration)
   val emailEditText = findViewById<EditText>(R.id.editTextTextEmailAddress)
        val editText = findViewById<EditText>(R.id.editTextText)
        val passwordEditText = findViewById<EditText>(R.id.editTextTextPassword)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener{
            val email = emailEditText.text.toString().trim()
            val pasword = passwordEditText.text.toString().trim()
            val name = editText.text.toString().trim()
            if (isValidEmail(email)){
                qoLooperPage = findViewById(R.id.button1)
                qoLooperPage.setOnClickListener{
                    val intent = Intent (this@Registration, Creating_code ::class.java)
                    startActivity(intent)
                    finish()
                }
            } else{

            }
        }

    }
    private fun isValidEmail(email: String): Boolean {
        val emailPattern  = "[a-z A-Z 0-9._-]+@[a-z]+\\.+[a-z]+"
        return email.matches(emailPattern.toRegex())
    }
    private fun isValidPassword(pasword: String): Boolean {
        val paswordPattern  = "[>6]"
        return pasword.matches(paswordPattern.toRegex())
    }
}