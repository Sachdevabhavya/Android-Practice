package com.example.groceryapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView:RecyclerView = findViewById(R.id.recyclerview)
        recyclerView.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL,
            false
        )

        var groceryItems:ArrayList<ItemModel> = ArrayList()

        val v1 = ItemModel("Fruits","Fresh Fruits from the Garden",R.drawable.fruits)
        val v2 = ItemModel("Vegetables","Delicious Vegetables",R.drawable.vegetables)
        val v3 = ItemModel("Bakery","Bread , Wheat and Beans",R.drawable.bread)
        val v4 = ItemModel("Beverage","Juice , Tea , Coffee and Soda",R.drawable.beverage)
        val v5 = ItemModel("Milk","Milk , Shakes and Yogurt",R.drawable.milk)
        val v6 = ItemModel("Snacks","Popcorn , Donut and Drinks",R.drawable.popcorn)

        groceryItems.add(v1)
        groceryItems.add(v2)
        groceryItems.add(v3)
        groceryItems.add(v4)
        groceryItems.add(v5)
        groceryItems.add(v6)


        val adapter = MyAdapter(groceryItems)
        recyclerView.adapter = adapter


    }
}