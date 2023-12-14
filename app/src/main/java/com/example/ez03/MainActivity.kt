package com.example.ez03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edt1: EditText = findViewById(R.id.edt1)
        val edt2: EditText = findViewById(R.id.edt2)
        val result: TextView = findViewById(R.id.result)
        val tw0: TextView = findViewById(R.id.tw0)
        val plus: Button = findViewById(R.id.plus)
        val minus: Button = findViewById(R.id.minus)
        val multiply: Button = findViewById(R.id.multiply)
        val divider: Button = findViewById(R.id.divider)
        val modulo: Button = findViewById(R.id.modulo)
        val clear: Button = findViewById(R.id.clear)

        var x:String = ""
        var y:String = ""
        var i = 0
        var sum = 0

        clear.setOnClickListener {
            edt1.setText(" ")
            edt2.setText(" ")
            result.setText(" ")
            tw0.setText("")
        }

        plus.setOnClickListener {
             x = edt1.text.toString()
             y = edt2.text.toString()

            if (x == "" || y == "") {


                Toast.makeText(
                    applicationContext,
                    "ใส่ให้ครบดิ",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                i = x.toInt() + y.toInt()
                result.setText(i.toString())
            }
        }

        minus.setOnClickListener {
//            var x = edt1.text.toString().toInt()
//            var y = edt2.text.toString().toInt()
            if (x == "" || y == "") {
                Toast.makeText(
                    applicationContext,
                    "ใส่ให้ครบดิ",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                i = x.toInt() - y.toInt()
                result.setText(i.toString())
            }

        }

        multiply.setOnClickListener {
//            var x = edt1.text.toString().toInt()
//            var y = edt2.text.toString().toInt()
            if (x == "" || y == "") {
                Toast.makeText(
                    applicationContext,
                    "ใส่ให้ครบดิ",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                i = x.toInt() * y.toInt()
                result.setText(i.toString())

            }
        }

        divider.setOnClickListener {
//            var x = edt1.text.toString().toInt()
//            var y = edt2.text.toString().toInt()
            if (x == "" || y == "") {
                Toast.makeText(
                    applicationContext,
                    "ใส่ให้ครบดิ",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                i = x.toInt() / y.toInt()
                result.setText(i.toString())

            }
        }

        modulo.setOnClickListener {
//            var x = edt1.text.toString().toInt()
//            var y = edt2.text.toString().toInt()
            if (x == "" || y == "") {
                Toast.makeText(
                    applicationContext,
                    "ใส่ให้ครบดิ",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                i = x.toInt() % y.toInt()
                result.setText(i.toString())

            }
        }
    }
}

