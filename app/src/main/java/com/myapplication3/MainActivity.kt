package com.myapplication3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.layout)

        val weightTextBox = findViewById<EditText>(R.id.WieghtTextBox)
        val heightTextBox = findViewById<EditText>(R.id.HeightTextBox)
        val calculateBTN = findViewById<Button>(R.id.CalculateBTN)
        calculateBTN.setOnClickListener {
            val weight = weightTextBox.text.toString().toDouble()
            val height = heightTextBox.text.toString().toDouble()
            val result = (weight / (height * height))
            val myIntent = Intent(this, MainActivity2::class.java)
            myIntent.putExtra("bmi", result)
            startActivity(myIntent)


        }

    }
}

