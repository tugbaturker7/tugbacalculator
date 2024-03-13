package com.example.tugbacalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var Result: Double = 0.0
    var Number1: Int = 0
    var Number2: Int = 0
    lateinit var Input1: EditText
    lateinit var Input2: EditText
    lateinit var ResultText: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Input1 = findViewById<EditText>(R.id.inputFirst)
        Input2 = findViewById<EditText>(R.id.inputSecond)
        ResultText = findViewById<TextView>(R.id.result)

    }


    fun subtraction(view: View) {

        Number1 = Input1.text.toString().toInt()
        Number2 = Input2.text.toString().toInt()
        Result = Number1 - Number2.toInt().toDouble()
        ResultText.text = Result.toString()
        Number1 = 0
        Number2 = 0
        Result = 0.0 }

    fun dividing(view: View) {

        Number1 = Input1.text.toString().toInt()
        Number2 = Input2.text.toString().toInt()
        Result = Number1 / Number2.toDouble()
        ResultText.text = Result.toString()

        Number1 = 0
        Number2 = 0
        Result = 0.0 }

    fun adding(view: View) {

        Number1 = Input1.text.toString().toInt()
        Number2 = Input2.text.toString().toInt()
        Result = Number1 + Number2.toDouble()
        ResultText.text = Result.toInt().toString()

        Number1 = 0
        Number2 = 0
        Result = 0.0 }

    fun multiplication(view: View) {

        Number1 = Input1.text.toString().toInt()
        Number2 = Input2.text.toString().toInt()
        Result = Number1 * Number2.toDouble()
        ResultText.text = Result.toInt().toString()

        Number1 = 0
        Number2 = 0
        Result = 0.0 }



}