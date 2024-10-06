package com.myapplication3

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val textView = findViewById<TextView>(R.id.textView)
        val bmiResult = intent.getDoubleExtra("bmi", 0.0)
        textView.text = getStatus(bmiResult)

    }

    private fun getStatus(bmi: Double): String {
       // return if (bmi <= 18.5) "Under Weight" else if (bmi <= 24.9) "Normal" else if (bmi <= 29.9) "Over Weight"
      //  else "Obese"
        return "hi"

    }

}
