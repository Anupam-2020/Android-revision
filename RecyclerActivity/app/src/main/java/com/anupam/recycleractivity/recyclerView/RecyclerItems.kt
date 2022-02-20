package com.anupam.recycleractivity

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

data class BasicInfo(
    val name: String,
    val email: String
)


class RecyclerAdapter(
    private val context: Context,
    private val infoList: ArrayList<BasicInfo>
):RecyclerView.Adapter<RecyclerViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val inflater = LayoutInflater.from(context)
        val vw = inflater.inflate(
            R.layout.recycler_item,
            parent,
            false
        )
        return RecyclerViewHolder(vw)
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        holder.nameInfo().text = infoList[position].name
        holder.emailInfo().text = infoList[position].email
    }

    override fun getItemCount(): Int {
        return infoList.size
    }

}



class RecyclerViewHolder(
    private val infVw: View
): RecyclerView.ViewHolder(infVw) {
    fun nameInfo() = infVw.findViewById<TextView>(R.id.name)
    fun emailInfo() = infVw.findViewById<TextView>(R.id.email)
}