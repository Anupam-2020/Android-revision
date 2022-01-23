package com.dfarm.myapplication.classes_and_objects



open class Person(var name: String, var age: Int) {

    protected var favouriteFood: String = "unknown"
    // setFavouriteFood(value:String)
    // getFavouriteFood(): String

    fun info() {
        println("This person's name is $name and they are $age year(s) old.")
    }
    protected fun printFavouriteFood() {
        println(favouriteFood)
    }

}

open class Chef(name: String, age: Int, favFood: String): Person(name, age) {


    init {
        favouriteFood = favFood
        printFavouriteFood()
    }


    fun setMyFavouriteFood(food: String) {
        favouriteFood = food
        printFavouriteFood()
    }
}

class SousChef(name: String, age: Int, favFood: String): Chef(name,age, favFood) {

    init {
        printFavouriteFood()
    }
}


fun main() {

    val p = Person("Anupam",28)
    val c = Chef("Anupam",23,"Biryani")

    c.setMyFavouriteFood("Roti")
//    c.printFavouriteFood()
//    p.printFavouriteFood()
    p.info()
    val s = SousChef("Anupam",20,"Roti Chawal")
    s.info()
}