package com.example.holamon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Visor_contador : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_visor_contador)
        val contador:Int? = intent.getIntExtra("contador",0)
        val text_pantalla = findViewById<TextView>(R.id.text_contador_2)
        text_pantalla.setText(contador.toString())
    }
}