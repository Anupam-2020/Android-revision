package com.dfarm.myapplication.classes_and_objects

class Vehicle {
    var brand: String = "unknown"

    fun info() = println(brand)

    inner class SteeringWheel {
        var name = "Leather"
        fun info() = println(name)
    }

    class Transmission {
        var type = "Automatic"
        fun shift() = println("The vehicle has shifted $type")
    }
}



fun main() {
    val anu = Vehicle() // instance creation for class.
    anu.SteeringWheel().info() // instance creation for inner class.
    anu.info()
    val anu2 = Vehicle.Transmission() // instance creation for nested class
    println(anu2.shift())
    val anu3 = anu.SteeringWheel() // instance creation for inner class.
    anu3.info()

}