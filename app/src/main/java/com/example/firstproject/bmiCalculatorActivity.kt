package com.example.firstproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class bmiCalculatorActivity : AppCompatActivity() {
    lateinit var btnSend: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmi_calculator)
    }
}