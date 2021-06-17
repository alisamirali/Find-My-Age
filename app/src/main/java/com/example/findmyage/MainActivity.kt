package com.example.findmyage

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.buttonCal)
        button.setOnClickListener {
            buttonClicked()
        }
    }

    fun buttonClicked () {
        val editText = findViewById<EditText>(R.id.editTextDate)
        val textView = findViewById<TextView>(R.id.textViewShowAge)

        val userDateOfBirth = Integer.parseInt(editText.text.toString())
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        val userAge = currentYear - userDateOfBirth

        textView.text = "Your Age Is: $userAge Years."
    }
}