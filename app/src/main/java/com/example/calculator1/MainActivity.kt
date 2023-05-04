package com.example.calculator1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    lateinit var tilFirstNumber: TextInputLayout
    lateinit var entfirstNumber:TextInputEditText
    lateinit var entsecondNumber:TextInputEditText
    lateinit var tilSecondNumber: TextInputLayout
    lateinit var btAddition: Button
    lateinit var btSubtraction: Button
    lateinit var btMultiply: Button
    lateinit var btModulus: Button
    lateinit var tvResult: TextView




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       castviews()
    }


    fun castviews(){

        tilFirstNumber=findViewById(R.id.tilFirstNumber)
        tilSecondNumber=findViewById(R.id.tilSecondNumber)
        entfirstNumber=findViewById(R.id.entfirstNumber)
        entsecondNumber=findViewById(R.id.entsecondNumber)

        btAddition=findViewById(R.id.btAddition)
        btModulus=findViewById(R.id.btModulus)
        btMultiply=findViewById(R.id.btMultiply)
        btSubtraction=findViewById(R.id.btSubtraction)
        tvResult=findViewById(R.id.tvResult)

        btModulus.setOnClickListener { calculations('%') }
        btSubtraction.setOnClickListener { calculations('-')}
        btAddition.setOnClickListener { calculations('+')}
        btMultiply.setOnClickListener { calculations('*')}
    }
    fun calculations(operator:Char){
        val num1=entfirstNumber.text.toString().toDouble()
        val num2=entsecondNumber.text.toString().toDouble()
        val result=  when (operator){
            '+'-> num1+num2
            '-'-> num1-num2
            '*'-> num1*num2
            '%'-> num1%num2
            else -> throw IllegalArgumentException("Invalid operator:$operator")


        }
        tvResult.text=result.toString()
    }

}



