package com.example.groceryapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val itemsList: ArrayList<ItemModel>):RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    inner class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var itemImg:ImageView
        var itemTitle:TextView
        var itemDesc:TextView

        init {
            itemImg = itemView.findViewById(R.id.imageView)
            itemTitle = itemView.findViewById(R.id.title_txt)
            itemDesc = itemView.findViewById(R.id.description_text)

            itemView.setOnClickListener(){
                Toast.makeText(itemView.context,
                    "You choose ${itemsList[adapterPosition].name}",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)

        return MyViewHolder(v)
    }

    override fun getItemCount(): Int {
        return itemsList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemTitle.setText(itemsList[position].name)
        holder.itemDesc.setText(itemsList[position].desc)
        holder.itemImg.setImageResource(itemsList[position].img)
    }
}