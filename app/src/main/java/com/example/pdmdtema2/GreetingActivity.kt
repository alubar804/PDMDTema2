package com.example.pdmdtema2

import android.app.Activity
import android.os.Bundle
import kotlinx.android.synthetic.main.greeting_layout.*

class GreetingActivity :Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.greeting_layout)
        val intencion = intent
        val extrass = intencion.extras
        val name= extrass?.getString("name")
        greetingTextView.text="Hello $name "
    }


}