package com.dfarm.myapplication.dataStructures

import android.os.Build
import androidx.annotation.RequiresApi


// Map is data structure with key-value pair.
@RequiresApi(Build.VERSION_CODES.N)
fun main() {

    val states = mapOf(
        "BI" to "Bihar",
        "DL" to "Delhi",
        "UP" to "Uttar Pradesh",
        "KL" to "Kerala",
        "A" to User("Hello","World",4),
        "B" to 23
    )
    
    val result = states["BI"] // returns Bihar(value)
    println(result)
    val res = states["Sy"] // returns null
    println(res)

    val res1 = states.getOrDefault("KX","UNKNOWN")
    println(res1)
}
