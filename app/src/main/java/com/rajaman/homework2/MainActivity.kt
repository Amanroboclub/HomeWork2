package com.rajaman.homework2

import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val number1 = findViewById<EditText>(R.id.mainEditTextNum1)
        val number2 = findViewById<EditText>(R.id.mainEditTextNum2)
        
        mainAddbutton.setOnClickListener {
            if(number1.text.isEmpty() or number2.text.isEmpty()){
                Toast.makeText(this,"Please Enter Proper value",Toast.LENGTH_LONG).show()
            }else{
            val num1 = number1.text.toString().toInt()
            val num2 = number2.text.toString().toInt()
            val Add = num1 + num2
            mainTextViewResult.text = Add.toString()

        }}
        mainSubbutton.setOnClickListener {
            if (number1.text.isEmpty() or number2.text.isEmpty()) {
                Toast.makeText(this, "Please Enter Proper value", Toast.LENGTH_LONG).show()
            } else {
                val num1 = number1.text.toString().toInt()
                val num2 = number2.text.toString().toInt()
                val Sub = num1 - num2
                mainTextViewResult.text = Sub.toString()
                mainEditTextNum1.text.clear()
                mainEditTextNum2.text.clear()
            }

        }

    }



}