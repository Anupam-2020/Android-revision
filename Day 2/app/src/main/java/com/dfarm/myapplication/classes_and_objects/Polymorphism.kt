package com.dfarm.myapplication.classes_and_objects


// Parent class can hold a reference to its child class and calls methods of the child classes.
// Helps to write maintainable and extensible codes.
// Helps in interacting with objects via common interface.


open class Shape {
    open fun area(): Double {
        return 0.0
    }
}

class Circle(val radius: Double): Shape() {
    override fun area(): Double {
//        return super.area()
        return Math.PI*radius*radius
    }
}

class Square(val side: Double): Shape() {
    override fun area(): Double {
        return side*side
    }
}

fun calculateArea(shape: Array<Shape>) {
    for (i in shape) {
        println(i.area())
    }
}


fun main() {
    val circle = Circle(2.3)
    val square = Square(3.4)
    val shape: Shape = Square(4.5)

//    println(circle.area())
//    println(square.area())
//    println(shape.area())

    val shapes = arrayOf(Circle(3.0),Square(4.5),Square(6.0))
    calculateArea(shapes)
}