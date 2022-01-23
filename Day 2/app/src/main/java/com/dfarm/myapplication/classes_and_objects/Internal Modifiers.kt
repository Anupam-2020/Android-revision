package com.dfarm.myapplication.classes_and_objects

// For Internal modifier for classes.
internal class Axle(val numberOfWheels: Int)

open class Autmobile(var clocr: String) {

    private lateinit var axles: MutableList<Axle>
    fun info() {
        println("The vehicle is $clocr")
    }

    fun addAxle(numberOfWheels: Int) {
        axles.add(Axle(numberOfWheels))
    }

    fun getAxleInfo() {

    }
}

class Truck(color: String) : Autmobile(color) {
    init {
        addAxle(2)
        addAxle(4)
    }
}

fun main() {
    val t = Truck("Green")
    t.addAxle(4)
    t.getAxleInfo()

    val k = Kia()
    k.selfDrive()
    k.drive()
}
