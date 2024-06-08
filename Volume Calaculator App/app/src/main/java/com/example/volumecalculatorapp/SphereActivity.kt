package com.example.volumecalculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.inputmethod.EditorInfo
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SphereActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sphere)

        val textView:TextView = findViewById(R.id.textview2)
        val result = findViewById<TextView>(R.id.textview3)
        val button = findViewById<Button>(R.id.btn1)
        val editText = findViewById<EditText>(R.id.editText_Sphere)

        button.setOnClickListener{
            var radius = editText.text.toString()
            var r = Integer.parseInt(radius)

            var volume = 1.333*3.14159*r*r*r
            result.text = "Volume = $volume m^3"
        }

//        editText.setOnEditorActionListener(TextView.OnEditorActionListener { _, actionId, event ->
//            if (event != null && event.keyCode == KeyEvent.KEYCODE_ENTER || actionId == EditorInfo.IME_ACTION_DONE) {
//                //do what you want on the press of 'done'
//                button.performClick()
//            }
//            return@OnEditorActionListener false
//        })
    }
}