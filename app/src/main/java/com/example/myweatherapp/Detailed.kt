package com.example.myweatherapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Detailed: AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed)

        val buttonBack = findViewById<Button>(R.id.buttonDetailed)

        buttonBack.setOnClickListener{
            val intent = Intent(this,MainPage::class.java)
            startActivity(intent)
        }
    }
}

