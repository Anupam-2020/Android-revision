package com.dfarm.myapplication.classes_and_objects

class UserClass(
    var firstName: String,
    var lastName: String
){
    var age: Int = 0
    var favouriteColor: String = "Blue"

    fun fullName(): String = "$firstName $lastName"

    override fun toString(): String {
        return fullName()
    }


    fun updateFirstName(suffix: String) {
        firstName = "$suffix $firstName"
    }

    companion object{ // companion object can be called without creating instance of the class.
        fun createUser(fstNm: String,lstNm: String) : String{
            return "$fstNm - $lstNm"
        }

        val users = mutableListOf<UserClass>()
        fun createUsers(count: Int): List<UserClass> {
            for (i in 0..count) {
                users.add(UserClass("FirstName$i -","LastName$i"))
            }
            return users
        }
    }
}

object FavouriteFood {
    var name = "unknown"
    var ingredients = mutableListOf<String>()

}



fun main() {
    val user2 = UserClass("pony","tail")
    println(user2.fullName())
    println(user2.toString())
    user2.updateFirstName("Mr.")
    println(user2.fullName())
    println(user2.firstName)

    val xyz = UserClass.createUser("Anupam","Anand")
    println(xyz)
    val abc = UserClass.createUsers(10)
    println(abc)
    abc.forEach {
        println(it)
    }

    UserClass.createUsers(12)
    val abc2 = UserClass.users
    abc2.forEach {
        println(it)
    }


    println(FavouriteFood.name)
    FavouriteFood.name = "Watermelon"
    println(FavouriteFood.name)
}