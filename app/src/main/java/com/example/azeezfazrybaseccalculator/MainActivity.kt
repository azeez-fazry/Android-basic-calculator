package com.example.azeezfazrybaseccalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buOpEvent(view: View) {
        val buSelect = view as  Button
        val number1:Double = etNumber1.text.toString().toDouble()
        val number2:Double = etNumber2.text.toString().toDouble()
        var final:Double
        when(buSelect.id) {
            buAdd.id -> {
                final = number1 + number2
                tvDisplay.setText (number1.toString() + " + " + number2.toString() + " = " + final.toString())
            }
            buSub.id -> {
                final = number1 - number2
                tvDisplay.setText(number1.toString() + " - " + number2.toString() + " = " + final.toString())
           }
            buMul.id -> {
                final = number1 * number2
                tvDisplay.setText(number1.toString() + " * " + number2.toString() + " = " + final.toString())
            }
            buDiv.id -> {
                try{
                    final = number1 / number2
                    tvDisplay.setText(number1.toString() + " / " + number2.toString() + " = " + final.toString())
                }
                catch(e:ArithmeticException){
                    tvDisplay.setText("Error!")
                }
            }
            buReset.id -> {
                etNumber1.setText("")
                etNumber2.setText("")
                tvDisplay.setText("")
            }
        }
    }
}