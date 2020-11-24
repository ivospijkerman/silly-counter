package com.example.sillycounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val displayText: TextView = findViewById(R.id.displayText)
        val incrementButton: Button = findViewById(R.id.incrementButton)

        incrementButton.setOnClickListener {
            counter++
            displayText.text = counter.toString()
        }
    }
}