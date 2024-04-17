package com.example.practica_1

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class Practica1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practica1)

        val textView = findViewByld<TextView>(R.id.textView)
        val button = findViewByld<Button>(R.id.button)

        button.setOnClickListener {
            textView.text = "Texto cambiado"
        }
    }
}