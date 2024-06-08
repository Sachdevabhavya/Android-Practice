package com.example.volumecalculatorapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CubeActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cube)

        val textView: TextView = findViewById(R.id.textview2)
        val result = findViewById<TextView>(R.id.textview3)
        val button = findViewById<Button>(R.id.btn1)
        val editText = findViewById<EditText>(R.id.editText_edge_cube)

        button.setOnClickListener{
            var edge = editText.text.toString()
            var e = Integer.parseInt(edge)

            var volume = e*e*e
            result.text = "Volume = $volume m^3"
        }
    }
}