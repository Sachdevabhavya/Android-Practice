package com.example.fragmentsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1: Button = findViewById(R.id.displayFrag1)
        val btn2: Button = findViewById(R.id.displayFrag2)

        btn1.setOnClickListener{
            val fragment1:FragmentOne = FragmentOne()
            loadFragment(fragment1)
        }

        btn2.setOnClickListener{
            val fragment2 : FragmentTwo = FragmentTwo()
            loadFragment(fragment2)
        }
    }

    fun loadFragment(fragment: Fragment){
        val fragmentManager = supportFragmentManager

        val fragmentTransaction :FragmentTransaction = fragmentManager.beginTransaction()

        fragmentTransaction.replace(R.id.frameLayout , fragment)
        fragmentTransaction.commit()
    }
}