package com.dfarm.myapplication.classes_and_objects

class DataClass(
    var firstName: String,
    var lastName: String
)

data class Order(
    val amount: Int,
    val customer: DataClass
)


fun main() {

    val p1 = DataClass(lastName = "Anupam",firstName = "Anand")
    val p2 = DataClass("Anupam","Anand")
    println(p1===p2) // p1==p2 is true for `data class`  but p1==p2 is false for `class`.
    println(p1.firstName==p2.firstName)
    val order = Order(200,p1)
    println(order.copy(amount = 100,customer = p1))
}