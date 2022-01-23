package com.dfarm.myapplication.classes_and_objects

// concept of interface..........................................................
interface Mammal {
    var type: String
    fun walk()
    fun eyes() {
        println("Looking")
    }
}

interface Cow : Mammal {
    var type1: String
    fun moo()
}

interface Human : Cow {
    fun eat() {
        println("Walking on 4 legs.")
    }

    var type2: String
}

// if a class extends an interface then it has to take the member variables of the parent class
// as constructor variables and has to override the member functions which have no body associated.
class dcdc(override var type: String) : Mammal {
    override fun walk() {

    }

}


// if a class extends an interface which further extends an interface then the extended class has to
// take the member variables of both the interfaces as constructor elements and override the
// member functions of both interfaces (if further extension is there then multiple overridden functions) .
class dcdc2(override var type: String, override var type1: String) : Cow {
    override fun moo() {

    }

    override fun walk() {

    }
}


class dcdc3(override var type: String, override var type2: String, override var type1: String) :
    Human {
    override fun moo() {

    }

    override fun walk() {

    }

}