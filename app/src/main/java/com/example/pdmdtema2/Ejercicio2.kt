package com.example.pdmdtema2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_ejercicio2.*
class Ejercicio2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio2)
        val boton1 = findViewById<Button>(R.id.EJ2button)
        boton1.setOnClickListener {
            val name = EJ2in1.text.toString()
            val surname = EJ2in2.text.toString()
            val aa = Intent(this, GreetingActivity2::class.java)

            aa.putExtra("name", name)
            aa.putExtra("surname", surname)
            startActivity(aa)
        }
    }
}