package com.dfarm.myapplication.classes_and_objects


// Sealed classes can't be instantiated.
sealed class Tile
class Red(val type: String, val points: Int): Tile()
class Blue(val points: Int):Tile()

fun main() {

    val tile:Tile = Red("Mushroom",21)
    val tile3 = Red("Book",34)
    val tile2 = Blue(23)

    val points = when(tile) {
        is Red -> tile.points*2
        is Blue -> tile.points*5
    }

    println(points)
}