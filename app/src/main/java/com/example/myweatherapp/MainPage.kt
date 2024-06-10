package com.example.myweatherapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainPage : AppCompatActivity() {

    private var day = arrayOf(
        "Monday",
        "Tuesday",
        "Wednesday",
        "Thursday",
        "Friday",
        "Saturday",
        "Sunday"
    )

    private var temperature = arrayOf(
        17,
        15,
        13,
        13,
        12,
        10,
        9
    )

    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainpage)

        val editTextDay = findViewById<EditText>(R.id.editTextDay)
        val textViewTemperature = findViewById<TextView>(R.id.textViewTemperature)
        val buttonWeather = findViewById<Button>(R.id.buttonWeather)
        val buttonClear = findViewById<Button>(R.id.buttonClear)
        val buttonExit = findViewById<Button>(R.id.buttonExit)
        val buttonDetailed = findViewById<Button>(R.id.buttonDetailed)

        buttonWeather.setOnClickListener {
            val inputDay = editTextDay.text.toString()
            val index = day.indexOf(inputDay)
            if (index != -1) {
                textViewTemperature.text = "Temperature on $inputDay is ${temperature[index]}°C"
            } else {
                textViewTemperature.text = "Please enter valid information"
            }
        }

        buttonClear.setOnClickListener {
            editTextDay.text.clear()
            textViewTemperature.text = ""
        }

        buttonExit.setOnClickListener {
            finishAffinity()
        }

        buttonDetailed.setOnClickListener {
            val intent = Intent(this, Detailed::class.java)
            startActivity(intent)
        }
    }
}
