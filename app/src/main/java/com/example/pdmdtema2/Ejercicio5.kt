package com.example.pdmdtema2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.widget.TableLayout
import kotlinx.android.synthetic.main.activity_ejercicio5.*


class Ejercicio5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio5)
        var numSectreto =(1..6).random()
        val mlayout = findViewById<TableLayout>(R.id.laidout);
        mlayout.setBackgroundColor(getResources().getColor(R.color.blue));
        EJ5buttonReload.setOnClickListener {
            numSectreto = (1..6).random()
            //esto lo muestro para que sea mas facil identificar si funciona bien
            EJ5Resultado.text=numSectreto.toString()
            mlayout.setBackgroundColor(getResources().getColor(R.color.blue));
        }
        EJ5button1.setOnClickListener {
            if (numSectreto == 1) {
                mlayout.setBackgroundColor(getResources().getColor(R.color.red));
                EJ5Resultado.text="BANG"
            }else{
                mlayout.setBackgroundColor(getResources().getColor(R.color.blue));
            }
        }
        EJ5button2.setOnClickListener {
            if (numSectreto == 2) {
                mlayout.setBackgroundColor(getResources().getColor(R.color.red));
                EJ5Resultado.text="BANG"
            }else{
                mlayout.setBackgroundColor(getResources().getColor(R.color.blue));
            }
        }
        EJ5button3.setOnClickListener {
            if (numSectreto == 3) {
                mlayout.setBackgroundColor(getResources().getColor(R.color.red));
                EJ5Resultado.text="BANG"
            }else{
                mlayout.setBackgroundColor(getResources().getColor(R.color.blue));
            }

        }
        EJ5button4.setOnClickListener {
            if (numSectreto == 4) {
                mlayout.setBackgroundColor(getResources().getColor(R.color.red));
                EJ5Resultado.text="BANG"
            }else{
                mlayout.setBackgroundColor(getResources().getColor(R.color.blue));
            }

        }
        EJ5button5.setOnClickListener {
            if (numSectreto == 5) {
                mlayout.setBackgroundColor(getResources().getColor(R.color.red));
                EJ5Resultado.text="BANG"
            }else{
                mlayout.setBackgroundColor(getResources().getColor(R.color.blue));
            }

        }
        EJ5button6.setOnClickListener {
            if (numSectreto == 6) {
                mlayout.setBackgroundColor(getResources().getColor(R.color.red));
                EJ5Resultado.text="BANG"
            }else{
                mlayout.setBackgroundColor(getResources().getColor(R.color.blue));
            }

        }
    }
}