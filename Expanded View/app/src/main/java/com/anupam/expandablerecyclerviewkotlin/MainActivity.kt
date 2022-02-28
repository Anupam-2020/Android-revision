package com.anupam.expandablerecyclerviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    val versionList = listOf(
        Versions("Kit Kat", "Version 4.4 - 4.4.4", "Api Level 19", "Oldest Version"),
        Versions("Lollipop","Version 5.0 -5.1"," Api Level 21","Most uesd android version")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setRecyclerView()
    }

    private fun setRecyclerView() {
        val versionAdapter = VersionAdapter(versionList)
        val recyclerView = findViewById<RecyclerView>(R.id.recycler)
        recyclerView.adapter = versionAdapter
//        recyclerView.setHasFixedSize(true)
    }

}