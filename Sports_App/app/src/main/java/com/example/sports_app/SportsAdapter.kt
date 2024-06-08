package com.example.sports_app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class SportsAdapter (val sportsList:ArrayList<SportModel>):RecyclerView.Adapter<SportsAdapter.MyViewHolder>(){

    inner class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var sportsImg:ImageView
        var sportsName:TextView

        init {
            sportsImg = itemView.findViewById(R.id.imageViewCard)
            sportsName = itemView.findViewById(R.id.textView)

            itemView.setOnClickListener(){
                Toast.makeText(itemView.context,
                    "You choose ${sportsList[adapterPosition].sportName}",
                    Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_item_layout,parent,false)

        return MyViewHolder(v)
    }

    override fun getItemCount(): Int {
        return sportsList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.sportsImg.setImageResource(sportsList[position].sportImg)
        holder.sportsName.setText(sportsList[position].sportName)
    }
}