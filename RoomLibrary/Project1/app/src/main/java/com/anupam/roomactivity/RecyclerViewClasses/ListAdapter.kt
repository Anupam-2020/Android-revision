package com.anupam.roomactivity.RecyclerViewClasses

import android.content.Context
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.anupam.roomactivity.R
import com.anupam.roomactivity.database.User
import org.w3c.dom.Text

class ListAdapter(
    userList: List<User>,
    context: Context,
): RecyclerView.Adapter<MyViewHolder>(

) {

    private var userList = emptyList<User>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            LayoutInflater
                .from(
                    parent.context
                ).inflate(
                    R.layout.custom_row,
                    parent,
                    false)
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.getId().text = userList[position].id.toString()
        holder.getFirstName().text = userList[position].firstName
        holder.getLastName().text = userList[position].lastName
        holder.getAge().text = userList[position].agr.toString()
    }

    override fun getItemCount(): Int {
        return userList.size
    }

}



class MyViewHolder(
    val inflVw: View
): RecyclerView.ViewHolder(inflVw) {

    fun getId() = inflVw.findViewById<TextView>(R.id.txtId)
    fun getFirstName() = inflVw.findViewById<TextView>(R.id.txtFName)
    fun getLastName() = inflVw.findViewById<TextView>(R.id.txtLname)
    fun getAge() = inflVw.findViewById<TextView>(R.id.txtAge)
}