package com.dfarm.roomdatabaseactivity

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlin.math.absoluteValue

class MainActivity : AppCompatActivity() {

    private lateinit var database: ContactDatabase
    lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // The below one is not a good practice.
        database = Room.databaseBuilder(applicationContext, ContactDatabase::class.java, "contactDB").build()


        CoroutineScope(Dispatchers.IO).launch {
            database.contactDao().insertContact(Contact(0,"Anupam","67898787"))

        }

    }

    fun getData(view: View) {
        database.contactDao().getContact().observe(this, {
            view.findViewById<TextView>(R.id.text).text = it.toString()
            Log.i("@Data", it.toString())
        })

    }
}