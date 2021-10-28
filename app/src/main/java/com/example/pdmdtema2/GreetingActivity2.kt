package com.example.pdmdtema2

import android.annotation.SuppressLint
import android.app.Activity
import android.os.Bundle
import kotlinx.android.synthetic.main.greeting_layout.*
class GreetingActivity2 :Activity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.greeting_layout)
        val intencion = intent
        val extrass = intencion.extras
        val name= extrass?.getString("name")
        val surname=extrass?.getString("surname")
        greetingTextView.text="Hello $name $surname"

    }


}