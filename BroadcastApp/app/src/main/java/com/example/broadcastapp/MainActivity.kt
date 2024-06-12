package com.example.broadcastapp

import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    lateinit var airplaneModeReceiver:AirplaneModeReceiver
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var intentFilter : IntentFilter = IntentFilter("android.intent.action.AIRPLANE_MODE")

        airplaneModeReceiver = AirplaneModeReceiver()
        registerReceiver(airplaneModeReceiver,intentFilter)

    }

    override fun onDestroy() {
        unregisterReceiver(airplaneModeReceiver)
        super.onDestroy()
    }
}