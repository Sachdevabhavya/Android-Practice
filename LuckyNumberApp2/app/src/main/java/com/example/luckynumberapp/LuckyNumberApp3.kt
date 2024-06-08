package com.example.luckynumberapp


import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.util.rangeTo
import java.net.URI
import kotlin.random.Random

class LuckyNumberApp3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lucky_number_app3)

        val textview1 : TextView = findViewById(R.id.texthead)
        val textview2 : TextView = findViewById(R.id.luckyno)
        val shareButton : Button = findViewById(R.id.sharrebtn)

        val usernamenew :String= recieveusername()
        Toast.makeText(this,usernamenew,Toast.LENGTH_LONG).show()

        val randomnonew :Int = randomnumber()
        textview2.text = randomnonew.toString()

//        shareButton.setOnClickListener(){
//            intent = Intent(Intent.ACTION_VIEW)
//            intent.setData(Uri.parse("https://google.com"))
//            startActivity(intent)
//        }

        shareButton.setOnClickListener(){
            sharedata(usernamenew,randomnonew)
        }

    }

    fun recieveusername(): String {
        val bundle:Bundle? = intent.extras
        val username: String = bundle?.getCharSequence("Name").toString()
        return username
    }

    fun randomnumber():Int{
        val random = Random.nextInt(Int.MAX_VALUE)
        return random
    }

    @Suppress("LocalVariableName")
    fun sharedata(Username:String, num:Int){
        var i = Intent(Intent.ACTION_SEND)
        i.setType("text/plain")
        i.putExtra(Intent.EXTRA_SUBJECT,"$Username is lucky today")
        i.putExtra(Intent.EXTRA_TEXT,"Lucky number is $num")

        startActivity(i)
    }
}