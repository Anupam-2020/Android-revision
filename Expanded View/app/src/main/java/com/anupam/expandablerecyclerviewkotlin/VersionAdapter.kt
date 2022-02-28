package com.anupam.expandablerecyclerviewkotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class VersionAdapter(
    val versionList: List<Versions>
) : RecyclerView.Adapter<VersionViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VersionViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row, parent, false)
        return VersionViewHolder(view)
    }

    override fun onBindViewHolder(holder: VersionViewHolder, position: Int) {
        holder.codeName().text = versionList[position].codeName
        holder.version().text = versionList[position].version
        holder.apiLevel().text = versionList[position].apiLevel
        holder.description().text = versionList[position].description

        val isExpandable = versionList[position].expandable
        holder.expandableLayout().visibility = if(isExpandable) View.VISIBLE else View.GONE

        holder.linearLayout().setOnClickListener{
            val versions = versionList[position]
            versions.expandable = !versions.expandable
            notifyItemChanged(position)
        }
    }

    override fun getItemCount(): Int {
        return versionList.size
    }
}



class VersionViewHolder(
    val inflVw: View
): RecyclerView.ViewHolder(inflVw) {
    fun codeName() = inflVw.findViewById<TextView>(R.id.code_name)
    fun version() = inflVw.findViewById<TextView>(R.id.version)
    fun apiLevel() = inflVw.findViewById<TextView>(R.id.ApiLevel)
    fun description() = inflVw.findViewById<TextView>(R.id.description)
    fun linearLayout() = inflVw.findViewById<LinearLayout>(R.id.linearLayout)
    fun expandableLayout() = inflVw.findViewById<RelativeLayout>(R.id.expandable_layout)
}