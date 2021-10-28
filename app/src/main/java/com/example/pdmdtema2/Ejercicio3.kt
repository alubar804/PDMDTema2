package com.example.pdmdtema2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_ejercicio3.*

class Ejercicio3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio3)//EJ3Resultado

        EJ3button.setOnClickListener {
            val cateto1 = EJ3in1.text.toString().toInt()
            val cateto2 = EJ3in2.text.toString().toInt()
            val hipotenusa=((cateto1*cateto1)+(cateto2*cateto2))
        }
    }
}