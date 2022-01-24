package com.dfarm.myapplication.classes_and_objects


enum class Day(val num1: Int) {
    // Below are the objects of class `Day`.
    // Enum forms concrete objects, whose state can't be changed.
    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7);

    fun printFormattedDay():String {
        // This represents the object which has been called.
        return "Day is $this ${this.num1}"
    }
}



fun main() {
    val day = Day.MONDAY
    println(day)

    println(day.num1)

    for (i in Day.values()) {
        println("${i.num1} $i")
    }

    println(day.printFormattedDay())
}