package com.dfarm.myapplication.dataStructures

fun main() {

    // Sets don't allow duplicate items. Sets are immutable in nature.
    val name = setOf("Anupam","Anand",67,null,"Anupam", "hello", 'a')
    println(name)

    val mutableName = mutableSetOf("Anupam","Anand",67,null,"Anupam", "hello", 'a')
    mutableName.add("Anurag")

    println(mutableName)

    val people: Set<User> = mutableSetOf(
        User("Anupam","Anand",23),
        User("Rahul","Kumar",29)
    )

    people.forEach{
        println(it.firstName)
    }
}