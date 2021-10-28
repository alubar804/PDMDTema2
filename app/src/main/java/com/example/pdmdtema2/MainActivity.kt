package com.example.pdmdtema2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val boton1 = findViewById<Button>(R.id.button1)
        val boton2 = findViewById<Button>(R.id.button2)
        val boton3 = findViewById<Button>(R.id.button3)
        val boton4 = findViewById<Button>(R.id.button4)
        boton1.setOnClickListener{lanzarEj1()}
        boton2.setOnClickListener{lanzarEj2()}
        boton3.setOnClickListener{lanzarEj3()}
        boton4.setOnClickListener{lanzarEj4()}
    }

    private fun lanzarEj1 (){
        val i = Intent(this,Ejercicio1::class.java)
        startActivity(i)
    }
    private fun lanzarEj2 (){
        val i = Intent(this,Ejercicio2::class.java)
        startActivity(i)
    }
    private fun lanzarEj3 (){
        val i = Intent(this,Ejercicio3::class.java)
        startActivity(i)
    }
    private fun lanzarEj4 (){
        val i = Intent(this,Ejercicio4::class.java)
        startActivity(i)
    }
}