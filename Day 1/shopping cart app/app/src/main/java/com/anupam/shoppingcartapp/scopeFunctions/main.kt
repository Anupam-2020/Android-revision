package com.anupam.shoppingcartapp.scopeFunctions

fun main() {
        val person = Person()
//    ordinary instantiation of class variables.
    person.age = 20
    person.name  ="Anupam"

//     instantiation using `apply` scope function.

    /** apply scope function.
     * Property 1: we can refer to context object by using `this` keyword.
     * Property 2: Return value is context object itself.
     */

    person.apply {
        name = "Anurag"
        age = 20
        println(age)
    }

    val a: Any = person.apply {
        name = "Anurag"
        age = 27
        println(age)
        this.name
    }
        println(a.toString())

    // instantiation using `with` scope function.
    /** with scope function.
     * Property 1: we can refer to context object by using `this` keyword.
     * Property 2: Return value is lambda result.
     */
    with(person) {
        this.age = 25
        name = "Anupam"
        println(age)
        println(this.name)
    }


    val p: Any? = with(person) {
        age = 10
        name = "ANUPAM"
        age?.plus(5)
        name
    }
    println(p)

    // instantiation using `also` function.
     val numberList: MutableList<Int> = mutableListOf(1,2,3)

    /** also scope function.
     * Property 1: we can refer to context object by using `it` keyword.
     * Property 2: Return value is context value itself like apply.
     */
    val duplicateNumber = numberList.also {
        println("The list elements are: $it")
        it.add(4)
        println("List elements after adding are: $it")
    }

    println("Original numbers: $numberList")
    println("Duplicate numbers: $duplicateNumber")

    /** let scope function.
     * Property 1: we can refer to context object by using `it` keyword.
     * Property 2: Return value is lambda result like with.
     * Use let to avoid NullPointException
     */

    val name = "Anupam"
    println(name.reversed())
    println(name.uppercase())
    println(name.length)

    val l = name.let {
        println(it.reversed())
        println(it.uppercase())
        println(it.length)
        it.length
        it
    }
    println(l)

    name.let {
        println(it.reversed())
        println(it.uppercase())
        println(it.length)
    }

    /** run scope function.
     * run is the combination of with and let functions.
     * Property 1: Return value is lambda result.
     * Property 2: we can refer to the context object by using `it` keyword.
     * It we have to operate on a Nullable object and avoid NullPointException then use `run`.
     */

    val person1 : Person? = null
    person1?.run {
        println(name)
        println(age)
        age
    }
}