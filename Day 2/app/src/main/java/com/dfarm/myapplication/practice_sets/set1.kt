package com.anupam.kotlin_training.basics.practice_sets

import java.util.*


private fun q1() {
    var x: Int = 0
    x = 99
}

private fun q2() {
    val fn: (a: Int) -> Int = fun(a: Int): Int =  0
}

private  fun q3(): (a: Int, b: Int) -> String = fun(a: Int, a1: Int) = "abc"

private fun q4(): () -> Date = fun()  =  Date()

private fun q51(a: FloatArray){
    val a1: FloatArray = a
    // var a2: Int = a.size
    var j: Int = 0
    for (i in a1){
        a1[j++] = i*i
        //println(i*i)
    }
    for (i in a){
        println(i)
    }
}

private fun q52():(a: FloatArray)-> Unit = fun(a: FloatArray){
    val a1: FloatArray = a
    // var a2: Int = a.size
    var j: Int = 0
    for (i in a1){
        a1[j++] = i*i
        //println(i*i)
    }
    for (i in a){
        println(i)
    }
}

private fun q53(a:FloatArray, arr:(a: FloatArray)-> FloatArray){
    val a1: FloatArray = arr(a)
    var j: Int = 0
    for (i in a1){
        a1[j++] = i*i
        //println(i*i)
    }
    for (i in a){
        println(i)
    }
}

private fun q6(a:String,n: Int) = a.repeat(n)

private  infix fun Unit.q6(n: Int): String = "Anupam ".repeat(n)

private infix fun Unit.q7(n: String): CharArray = n.toCharArray()

private fun q8(n: String,n2: Int):CharArray {
    val n1 = n.toCharArray()
     n1[n2] = n1[n2].uppercaseChar()
    return n1
}

private fun q9(a:Int, b: Int,fnLm:(a:Int,b: Int)->Int ){
     println(a*b)
}

private fun q10(a: Int) {
    val v1: CharArray = "hello".toCharArray()
    v1[a] = 'h'

    println(v1)
}

private fun q11(a: Float) {
    val a1 = a.toInt()
    println(a1)
}

private fun q12(a: String){
    val a1 = a.toInt()
}

private fun q14(a: IntArray) {
    println("average is ${a.average()}")
    println("sum is ${a.sum()}")
    println("min is ${a.minOrNull()}")
    println("max is ${a.maxOrNull()}")
}

private fun q15(a: IntArray) {
    val a1: IntArray = a
    a1.sort()
    val size = a1.size
    println(a1[size-2])
}

private fun q16(a: IntArray,b: Int) {
    a.sort()
    println(a.contentToString())
    println(a.elementAt(a.size - b))
}

private fun q17(a: Int): String {
    val x = when {
        a > 70 -> "distinction"
        a in 61..69 -> "pass"
        a in 41..60 -> "second class"
        else -> "fail"
    }
    return x
}

private fun q19(a: String) {
    val a1 = a.toCharArray()
    val l: Int = a1.size-1
    for(i in l downTo 0 step 1) {
        print(a1[i])
    }

}





fun main() {
//     val x = q2()
//     println()

//    val x = q4()
//    val x1 = x()
//    println(x1)

    // println(q6("anupam ",3))
    // println(Unit.q6(3))
    // println(Unit.q7("Anupam"))

//    val ch = "anupam"
//    println(q8(ch,5))

//    val x1 = floatArrayOf(1.2f,2.6f,5.6f)
//    q51(x1)

     // val x2 = floatArrayOf(1.2f,2.6f,5.6f)

     // q53(x2) { x2 }
     // q53(x2,{x2})

//    val v = q9(2,4, { a, b ->
//        a * b
//    })

    // q10(2)
    // q11(2.6f)


//    val x1 = intArrayOf(2,3,5,6,7)
//    q14(x1)

     // q15(intArrayOf(2,5,6,2,45,78,98,8))
     // q16(intArrayOf(2,3,56,87,89,65),3)
    // println(q17(89))
    q19("asd")

}
