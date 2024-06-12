package com.example.servicesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var startBtn : Button = findViewById(R.id.playRingtone)
        var stopBtn : Button = findViewById(R.id.stopRingtone)

        startBtn.setOnClickListener {
            var startServiceIntent = Intent(
                applicationContext,
                MyService::class.java
            )
            startService(startServiceIntent)
        }

            stopBtn.setOnClickListener{
                var stopServiceIntent = Intent(
                    applicationContext,
                    MyService::class.java
                )
                stopService(stopServiceIntent)
        }
    }
}