package com.dfarm.myapplication.classes_and_objects

// Abstract classes.
abstract class Car(var color: String, val numberOfWheels: Int, numberOfDoors: Int) {

    abstract fun drive()
    fun abstract() {

    }

}

class Maruti(): Car("",2,4) {
    override fun drive() {

    }
}

abstract class Waganar(): Car("",0,0) {
    // abstract fun not needed in abstract extended class.
    abstract fun selfDrive()
}

// if a class extends a class which extends another class then the grand child class has to implement the
// abstract fun of both parent  and grand parent class.

class Kia(): Waganar() {
    override fun selfDrive() {

    }

    override fun drive() {

    }

}