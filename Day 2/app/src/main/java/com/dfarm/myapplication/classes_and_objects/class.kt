package com.dfarm.myapplication.classes_and_objects

class User {
    var firstNmae: String = ""
    var lastName: String = ""

    fun printFullName() {
        println("$firstNmae $lastName")
    }
    fun updateName(newName: String){
        firstNmae = newName
    }
}

fun main() {
    val friend = User()
    friend.firstNmae = "Anupam"
    friend.lastName = "Anand"
    friend.printFullName()


    val user = User()
    user.lastName = "Ashin"
    user.firstNmae = "Kumar"
    user.printFullName()
    user.updateName("Hello")
    user.printFullName()
}