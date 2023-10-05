package com.example.holamon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.example.holamon.databinding.ActivityMainBinding




class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var contador = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val text_contador = findViewById<TextView>(R.id.text_contador_2)
        //val text_contador = findViewById<TextView>(R.id.text_contador_2)
        text_contador.setText(contador.toString())

        val boto_add = findViewById<Button>(R.id.bt_add)
        boto_add.setOnClickListener({
            contador++
            text_contador.setText(contador.toString())
        })

        val boto_open = findViewById<Button>(R.id.bt_open)
        boto_open.setOnClickListener({
            val intent = Intent(baseContext,Visor_contador::class.java)
            intent.putExtra("contador",contador)
            startActivity(intent)
        })
    }
}