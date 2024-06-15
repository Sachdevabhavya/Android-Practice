package com.example.databinding

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

class Vehicle :BaseObservable(){

    var modelYear : String = ""

    @Bindable
    var name :String = ""
        set(value){
            field = value
            notifyPropertyChanged(BR.name)
        }

}
