package com.example.databinding

import android.database.DatabaseUtils
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(
            this,R.layout.activity_main
        )

        var v1 = Vehicle()
        v1.name = "Mercedes"
        v1.modelYear = "2024"
        binding.myVehicle = v1

        binding.clickhandler = VehicleClickHandlers(this)

//        binding.button.setOnClickListener{
//
//        }
    }
}