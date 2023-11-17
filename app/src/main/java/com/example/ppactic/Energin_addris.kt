package com.example.ppactic

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton

class Energin_addris : AppCompatActivity() {
    private lateinit var qoLooperPage: AppCompatButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.energin_addris)
        qoLooperPage = findViewById(R.id.button2)
        qoLooperPage.setOnClickListener {
            val intent = Intent(this@Energin_addris, Home_page::class.java)
            startActivity(intent)
            finish()
        }
    }
}
