package com.example.myweatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonEnter = findViewById<Button>(R.id.buttonEnter)
        val buttonExit = findViewById<Button>(R.id.buttonExit)

        buttonEnter.setOnClickListener {  // Sends you to mainpage
            val intent = Intent(this, MainPage::class.java)
            startActivity(intent)
        }

        buttonExit.setOnClickListener {
            finishAffinity() // closes the app
        }
    }
}
