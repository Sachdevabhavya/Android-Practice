package com.example.volumecalculatorapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class PrismActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prism)

        val textView: TextView = findViewById(R.id.textview2)
        val result = findViewById<TextView>(R.id.textview3)
        val button = findViewById<Button>(R.id.btn1)
        val editText1 = findViewById<EditText>(R.id.editText_base_prism)
        val editText2 = findViewById<EditText>(R.id.editText_height_prism)

        button.setOnClickListener{
            var base = editText1.text.toString()
            var b = Integer.parseInt(base)

            var height = editText2.text.toString()
            var h = Integer.parseInt(height)

            var volume = b*h
            result.text = "Volume = $volume m^3"
        }
    }
}