package com.example.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class CalculatorActivity : AppCompatActivity() {
   lateinit var btnNum1: Button
    lateinit var btnNum2: Button
    lateinit var etNumber1:EditText
    lateinit var etNumber2:EditText
    lateinit var btnAdd:Button
    lateinit var btnSub:Button
    lateinit var btnMultiply:Button
    lateinit var btnModulus:Button
    lateinit var tvAnswer:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        btnNum1=findViewById(R.id.btnNum1)
        btnNum2=findViewById(R.id.btnNum2)
        etNumber1=findViewById(R.id.etNumber1)
        etNumber2=findViewById(R.id.etNumber2)
        btnAdd=findViewById(R.id.btnAdd)
        btnSub=findViewById(R.id.btnSub)
        btnMultiply=findViewById(R.id.btnMultiply)
        tvAnswer=findViewById(R.id.tvAnswer)
        btnModulus=findViewById(R.id.btnModulus)

            btnAdd.setOnClickListener {
                var number1 = etNumber1.text.toString()
                var number2 = etNumber2.text.toString()
                add(number1.toInt(), number2.toInt())
            }
        btnSub.setOnClickListener {
            var number1 = etNumber1.text.toString()
            var number2 = etNumber2.text.toString()
            subtraction(number1.toInt(), number2.toInt())
        }
        btnMultiply.setOnClickListener {
            var number1 = etNumber1.text.toString()
            var number2 = etNumber2.text.toString()
            product(number1.toInt(), number2.toInt())
        }
        btnModulus.setOnClickListener {
            var number1 = etNumber1.text.toString()
            var number2 = etNumber2.text.toString()
            mod(number1.toInt(), number2.toInt())
        }

    }

    fun add(number1:Int,number2:Int){
        var sum=number1+number2
          tvAnswer.text=sum.toString()
    }
    fun subtraction(number1:Int,number2:Int){
        var minus=number1-number2
        tvAnswer.text=minus.toString()
    }
    fun product(number1:Int,number2: Int){
        var prdct=number1*number2
        tvAnswer.text=prdct.toString()
    }
    fun mod(number1: Int,number2: Int){
        var remainder=number1%number2
        tvAnswer.text= remainder.toString()
    }

}