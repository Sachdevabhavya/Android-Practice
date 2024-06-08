package com.example.luckynumberapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView:TextView = findViewById(R.id.Textview)
        val button:Button = findViewById(R.id.btn)
        val editText:EditText = findViewById(R.id.Edittext)

        button.setOnClickListener(){
            var name = editText.text
            val intent : Intent = Intent(this,LuckyNumberApp3::class.java)
            intent.putExtra("Name",name)
            startActivity(intent)
        }
    }
}