package com.example.databinding

import android.content.Context
import android.view.View
import android.widget.Toast

class VehicleClickHandlers (var context: Context){
    fun displayToastMsg(view: View){
        Toast.makeText(
            context,"You clicked me",
            Toast.LENGTH_SHORT
        ).show()
    }
}