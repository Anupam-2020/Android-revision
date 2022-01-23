package com.dfarm.myapplication.dataStructures


class User(
    var firstName: String,
    var lastName: String,
    var age: Int
)



// Arrays are of fixed size. Mutable in nature.
fun main() {


    val items = arrayOf("Anupam", "Anand",89)
    items.forEach {
        println(it)
    }

    val users = arrayOf(
        User("Anupam","Anand",23),
        User("Anurag","Anand",21)
    )
    users.forEach {
        println("${it.firstName}, ${it.lastName}, ${it.age}")
    }



    // to add items to array.
    val updatedUsers = users.plus(
        User("Rahul","Kumar",29)
    )

    updatedUsers.forEach {
        println("${it.firstName}, ${it.lastName}, ${it.age}")
    }

    // updating an array
    items[0] = "Rahul"
    items.forEach {
        println(it)
    }

    val fruitsArray:Array<String> = arrayOf("Apple","Grapes")
    val veggiesArray:Array<String>  = arrayOf("Cauliflower","Tomato")
    val devicesArray:Array<String> = arrayOf("Laptop","Mobile")

    val allArrays = arrayOf(fruitsArray,veggiesArray,devicesArray)
    println(allArrays.flatten())
    //    allArrays.forEach { it ->
//        println( it.forEach {
//            println(it)
//        })
//    }

}