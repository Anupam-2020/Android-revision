package com.dfarm.myapplication.dataStructures


// Lists are immutable in nature. We can't change the items or update the size after initialization. We can mutable keyword for this.

fun main() {

    val items = listOf(1,2,3,4,5,"Hello",6.7f)

    val values = mutableListOf(23,"Anupam",7.6f)

    val variables = mutableListOf(
        User("Anupam","Anand",2),
        items
    )

    val names = listOf("anupam", "anand","rahul","Siddharth")
    // to remove from list elementwise.
    variables.remove(items)

    // to add element.
    variables.add("Hello world")

    items.forEach {
        println(it)
    }

    val firstItem = items.first()
    println(firstItem)

    val name: String? = null

    // below code will return emptyList.
    val stuff = if(name == null) emptyList() else listOf(name)
    println(stuff)

    // adding elements to list.
    values.add("hello")


    values.remove(23)
    values.removeAt(0)
    values.forEach {
        println(it)
    }

    // filtering list.
    val filtered = values.filter {
        it != 23
    }
    println(filtered)

    val filterd = names.filter {
        it.contains("r")
    }
    println(filterd)



    val ages = listOf(23,45,67,76,21,12,18,3)
    fun isAdult(value: Int): Boolean {
        return value >= 18
    }
    val adults = ages.filter(::isAdult)
    println(adults)




    val fruits = listOf("Apple","Grapes")
    val veggies  = listOf("Cauliflower","Tomato")
    val devices = listOf("Laptop","Mobile")

    val allLists = listOf(fruits,veggies,devices)
    println(allLists)
    println(allLists.flatten())

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

    val mapVariable = allLists.map { it ->
        it.filter {
            it.contains("A")
        }
    }
    println(mapVariable)

    val mapVar = allLists.map {
        it[1]
    }
    println(mapVar)

    /** Map() returns a collection which can be stored in a variable whereas forEach returns nothing.**/
}