package com.example.ppactic

import android.content.Intent
import android.os.Bundle
import android.os.UserManager
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton

class entrance : AppCompatActivity() {
    var password = ""
    private lateinit var qoLooperPage : AppCompatButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.entrance)
        qoLooperPage = findViewById(R.id.exit)
        qoLooperPage.setOnClickListener {
            Log.e("XUI", "прошел ивент")
            val intent = Intent(this, Energin_addris::class.java)
            startActivity(intent)
            finish()
            val imageView = findViewById<ImageView>(R.id.botton1)
            val imageView1 = findViewById<ImageView>(R.id.botton2)
            val imageView2 = findViewById<ImageView>(R.id.botton3)
            val imageView3 = findViewById<ImageView>(R.id.botton4)
            val button1 = findViewById<Button>(R.id.button1)
            val button2 = findViewById<Button>(R.id.button2)
            val button3 = findViewById<Button>(R.id.button3)
            val button4 = findViewById<Button>(R.id.button4)
            val button5 = findViewById<Button>(R.id.button5)
            val button6 = findViewById<Button>(R.id.button6)
            val button7 = findViewById<Button>(R.id.button7)
            val button8 = findViewById<Button>(R.id.button8)
            val button9 = findViewById<Button>(R.id.button8)
            fun dltPassword() {
                if (password.length != 0) {
                    when (password.length) {
                        1 -> findViewById<ImageView>(R.id.botton1).setImageResource(R.drawable.boot)
                        2 -> findViewById<ImageView>(R.id.botton2).setImageResource(R.drawable.boot)
                        3 -> findViewById<ImageView>(R.id.botton3).setImageResource(R.drawable.boot)
                        4 -> findViewById<ImageView>(R.id.botton4).setImageResource(R.drawable.boot)
                    }
                    password = password.substring(0, password.length - 1)

                }
                Toast.makeText(this, password, Toast.LENGTH_SHORT).show()
            }

            fun setPassword(num: Int) {
                password += num
                if (password.length == 4) {
                    val sPref = getSharedPreferences("login", MODE_PRIVATE).edit()
                    val intent = Intent(this@entrance, Energin_addris::class.java)
                    startActivity(intent)
                    finish()
                } else {

                }

            }

            fun clic(view: View) {
                if (view.getTag().toString() != "dlt") {
                    setPassword(view.getTag().toString().toInt())
                } else {
                    dltPassword()
                }
            }


        }
    }
}