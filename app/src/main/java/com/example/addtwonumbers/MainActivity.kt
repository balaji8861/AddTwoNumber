package com.example.addtwonumbers

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etFirst = findViewById<EditText>(R.id.etFirst)
        val etSecond = findViewById<EditText>(R.id.etSecond)
        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        btnAdd.setOnClickListener {
            Log.d("DEBUG", "Add button clicked")

            val num1 = etFirst.text.toString().toDoubleOrNull()
            val num2 = etSecond.text.toString().toDoubleOrNull()

            tvResult.text = when {
                num1 == null || num2 == null -> "Please enter valid numbers"
                else -> "Sum: ${num1 + num2}"
            }
        }
    }
}
