package com.example.pdmdtema2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ejercicio4.*

class Ejercicio4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio4)
        var numSectreto=0
        EJ4button2.setOnClickListener {
           numSectreto=(0..100).random()
            if (!EJ4Resultado.text.equals("Tu numero no es")) {
                EJ4Resultado.text = "Empieza otra vez"
            }
        }
        EJ4button.setOnClickListener {
            val numero = EJ4in1.text.toString().toInt()
            when {
                numero<numSectreto ->  EJ4Resultado.text="Tu numero es menor"
                numero>numSectreto-> EJ4Resultado.text="Tu numero es mayor"
                else -> EJ4Resultado.text="YOU WIN"
            }

        }
    }
}