package com.example.volumecalculatorapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView


class MyCustomAdapter(context:Context,private val gridItems:List<Shape>):ArrayAdapter<Shape>(context,0,gridItems) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var itemView = convertView
        val holder:ViewHolder

        if(convertView==null){
            itemView = LayoutInflater.from(context).inflate(R.layout.grid_item_layout,parent,false)

            holder = ViewHolder()
            holder.imageView = itemView.findViewById(R.id.imageview)
            holder.textView = itemView.findViewById(R.id.textview)

            itemView.tag = holder
        }
        else{
            holder = itemView?.tag as ViewHolder
        }

        val currentItem = gridItems[position]
        holder.imageView.setImageResource(currentItem.shapeImg)
        holder.textView.text = currentItem.shapeName

        return itemView!!
    }

    private class ViewHolder {
        lateinit var imageView: ImageView
        lateinit var textView: TextView
    }
}