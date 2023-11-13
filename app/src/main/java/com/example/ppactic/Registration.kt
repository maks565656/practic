package com.example.ppactic

import android.content.Intent
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
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
   val emailEditText = findViewById<EditText>(R.id.editTextTextEmailAddress)
        val editText = findViewById<EditText>(R.id.editTextText)
        val passwordEditText = findViewById<EditText>(R.id.editTextTextPassword)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener{
            val email = emailEditText.text.toString().trim()
            val password = passwordEditText.text.toString().trim()
            val login = editText.text.toString().trim()
           if (email =="" || password == "" || login =="" )
            Toast.makeText(this, "не все поля заполненны", Toast.LENGTH_LONG).show()
            else{
    val User = User (email, password, login)
    val db = dat (this, null)
               Toast.makeText(this, "логин $login сохранен", Toast.LENGTH_LONG).show()
               db.addUser(User)
            emailEditText.text.clear()
               passwordEditText.text.clear()
               editText.text.clear()
           }
        }
    }

}
