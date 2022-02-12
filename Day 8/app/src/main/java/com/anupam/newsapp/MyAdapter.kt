package com.anupam.newsapp

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(
    private val songs: List<Songs>,
    private val context: Context
):RecyclerView.Adapter<MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(context).inflate(
            R.layout.item_view,
            parent,
            false
        )
        return MyViewHolder(inflater)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.txtTitle.text = songs[position].title
        holder.txtDescription.text = songs[position].description
        var color = "#CCCCCC"
        if(position % 2 == 0) {
            color = "#EEEEEE"
        }
        holder.itemView.setBackgroundColor(Color.parseColor(color))
    }

    override fun getItemCount(): Int {
        return songs.size
    }

}


class MyViewHolder(
//    private val infVw: View
infVw: View
    ): RecyclerView.ViewHolder(infVw) {

//    fun txtTitle(): TextView = infVw.findViewById(R.id.txtTitle)
//    fun txtDescription(): TextView = infVw.findViewById(R.id.txtDescription)
//    fun container():ConstraintLayout = infVw.findViewById(R.id.recConstraints)

        val txtTitle = infVw.findViewById<TextView>(R.id.txtTitle)
    val txtDescription = infVw.findViewById<TextView>(R.id.txtDescription)

}



