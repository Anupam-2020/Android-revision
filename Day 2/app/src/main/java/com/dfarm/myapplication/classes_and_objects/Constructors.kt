package com.dfarm.myapplication.classes_and_objects

class UserConst constructor(
    var firstName: String,
    var lastName: String,
    var isPlatinum: Boolean
){
    fun addName(name: String) {
        println("Anupam $name")
    }

    // `This` keyword is used to call primary constructor or another secondary constructor.........

    constructor(firstName: String,
                lastName: String
    ):this("Anupam",
        lastName,
        true) {
        println("isPlatinum is $isPlatinum")
    }

    constructor(firstName: String): this(firstName,"Unknown") {
        println("3rd constructor $firstName")
    }
    constructor():this("Anupam"){
        println("4th constructor $firstName")
    }

    constructor(fir: String,num: Int): this() // constructor calling with no parameters.

//    constructor(): this("","",true)


    init {
        println("This is init")
    }


    var fullName: String = "$firstName $lastName"
        get() = "Full Name: $field" //backing field.

}


fun main() {
    val const = UserConst("Hey","there") // secondary constructor is getting called.
    val const2 = UserConst("hey", " there", false) // primary constructor is getting called.
    val const3 = UserConst("Anupam")
    val const4 = UserConst()

    val use = UserConst("Anurag","Anand",true)
    println(use.fullName)
    use.fullName = "Anupam"
    println(use.fullName)
    use.fullName = "Rohit"
    println(use.fullName)
}