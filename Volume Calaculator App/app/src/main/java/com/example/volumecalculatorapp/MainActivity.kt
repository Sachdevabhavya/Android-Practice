package com.example.volumecalculatorapp


import android.content.Intent
import android.os.Bundle
import android.view.KeyEvent
import android.view.inputmethod.EditorInfo
import android.widget.GridView
import android.widget.TextView.OnEditorActionListener
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gridView:GridView = findViewById(R.id.gridview)

        val shape1:Shape = Shape(R.drawable.spherejpeg,"Sphere")
        val shape2:Shape = Shape(R.drawable.cylinderjpeg,"Cylinder")
        val shape3:Shape = Shape(R.drawable.cube,"Cube")
        val shape4:Shape = Shape(R.drawable.prismjpeg,"Prism")

        val gridItems = listOf<Shape>(shape1,shape2,shape3,shape4)

        val customAdapter = MyCustomAdapter(this,gridItems)
        gridView.adapter = customAdapter

        gridView.setOnItemClickListener{_ , _ , position , _ ->
            val clickedItem = customAdapter.getItem(position)

            if (clickedItem?.shapeName.equals("Sphere")){
                val i = Intent(this, SphereActivity::class.java)
                startActivity(i)
            }

            else if (clickedItem?.shapeName.equals("Cylinder")){
                val i = Intent(this, CylinderActivity::class.java)
                startActivity(i)
            }

            else if (clickedItem?.shapeName.equals("Cube")){
                val i = Intent(this, CubeActivity::class.java)
                startActivity(i)
            }

            else if (clickedItem?.shapeName.equals("Prism")){
                val i = Intent(this, PrismActivity::class.java)
                startActivity(i)
            }
        }
    }
}