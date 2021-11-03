package com.example.pdmdtema2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ejercicio6.*

class Ejercicio6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio6)
            val juego = arrayOf(
                arrayOf(0, 0, 0),
                arrayOf(0, 0, 0),
                arrayOf(0, 0, 0)
                )
        var  turno="O"
                    comprueba(juego)
        EJ611.setOnClickListener {
            if (!EJ611.text.equals("X") || !EJ611.text.equals("O")){
                EJ611.text=turno
                if(turno.equals("O")){
                    juego[0][0]=1
                     turno="X"
                    comprueba(juego)
                    comprueba(juego)
                }else{
                    juego[0][0]=-1
                     turno="O"
                    comprueba(juego)
                }
            }
        }
        EJ612.setOnClickListener {
            if (!  EJ612.text.equals("X") || !  EJ612.text.equals("O")){
                  EJ612.text=turno
                if(turno.equals("O")){
                    juego[0][1]=1
                     turno="X"
                    comprueba(juego)
                }else{
                    juego[0][1]=-1
                     turno="O"
                    comprueba(juego)
                }
            }
        }
        EJ613.setOnClickListener {
            if (!  EJ613.text.equals("X") || !  EJ613.text.equals("O")){
                  EJ613.text=turno
                if(turno.equals("O")){
                    juego[0][2]=1
                     turno="X"
                    comprueba(juego)
                }else{
                    juego[0][2]=-1
                     turno="O"
                    comprueba(juego)
                }
            }
        }
        EJ621.setOnClickListener {
            if (!  EJ621.text.equals("X") || !  EJ621.text.equals("O")){
                  EJ621.text=turno
                if(turno.equals("O")){
                    juego[1][0]=1
                     turno="X"
                    comprueba(juego)
                }else{
                    juego[1][0]=-1
                     turno="O"
                    comprueba(juego)
                }
            }
        }
        EJ622.setOnClickListener {
            if (!  EJ622.text.equals("X") || !  EJ622.text.equals("O")){
                  EJ622.text=turno
                if(turno.equals("O")){
                    juego[1][1]=1
                     turno="X"
                    comprueba(juego)
                }else{
                    juego[1][1]=-1
                     turno="O"
                    comprueba(juego)
                }
            }
        }
        EJ623.setOnClickListener {
            if (!  EJ623.text.equals("X") || !  EJ623.text.equals("O")){
                  EJ623.text=turno
                if(turno.equals("O")){
                    juego[1][2]=1
                     turno="X"
                    comprueba(juego)
                }else{
                    juego[1][2]=-1
                     turno="O"
                    comprueba(juego)
                }
            }
        }
        EJ631.setOnClickListener {
            if (!  EJ631.text.equals("X") || !  EJ631.text.equals("O")){
                  EJ631.text=turno
                if(turno.equals("O")){
                    juego[2][0]=1
                     turno="X"
                    comprueba(juego)
                }else{
                    juego[2][0]=-1
                     turno="O"
                    comprueba(juego)
                }
            }
        }
        EJ632.setOnClickListener {
            if (!  EJ632.text.equals("X") || !  EJ632.text.equals("O")){
                  EJ632.text=turno
                if(turno.equals("O")){
                    juego[2][1]=1
                     turno="X"
                    comprueba(juego)
                }else{
                    juego[2][1]=-1
                     turno="O"
                    comprueba(juego)
                }
            }
        }
        EJ633.setOnClickListener {
            if (!  EJ633.text.equals("X") || !  EJ633.text.equals("O")){
                  EJ633.text=turno
                if(turno.equals("O")){
                    juego[2][2]=1
                     turno="X"
                    comprueba(juego)
                }else{
                    juego[2][2]=-1
                     turno="O"
                    comprueba(juego)
                }
            }
        }


    }
fun comprueba(juego: Array<Array<Int>>) {
    val puntos = arrayOf(
        arrayOf(0, 0, 0),
        arrayOf(0, 0, 0),
        arrayOf(0, 0, 0)
    )

    var inverso=2
    for (i in 0..2){
        inverso=2-i
        puntos[0][0]+=juego[0][i]
        puntos[1][0]+=juego[1][i]
        puntos[2][0]+=juego[2][i]
        puntos[0][1]+=juego[i][0]
        puntos[1][1]+=juego[i][1]
        puntos[2][1]+=juego[i][2]
        puntos[0][2]+=juego[i][i]
        puntos[1][2]+=juego[inverso][inverso]
    }
    for (array in puntos) {
        for (value in array) {
            if (value==3){
                EJ6Texto1.text="El ganador es 0"
            }else if (value==-3){
                EJ6Texto1.text="El ganador es X"
            }
        }
    }
}

}
