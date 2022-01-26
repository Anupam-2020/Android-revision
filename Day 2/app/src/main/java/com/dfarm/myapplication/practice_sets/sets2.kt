package com.dfarm.myapplication.practice_sets

import java.util.*
import kotlin.collections.ArrayList

private fun q1(a: Array<Int>, b: Array<Int>)  = a + b


private fun q2(a: IntArray, b: IntArray): IntArray = a.union(b.toList()).toIntArray()

private fun q3(a: IntArray, b: IntArray): IntArray = a.intersect(b.toList()).toIntArray()

private fun q4(a: Array<String>,x: Int,x1: Int): Array<String> {
    val b: Array<String> = Array<String>(x1){""}
    for (i in a.indices) {
        if (i != x)
            b[i] = a[i]
    }
    return b
}


open class Bank(
    ifsc: String,
    add: String,
    id: Int) {
    open fun performTransaction(): String {
        return "In Bank"
    }
}

class AbcBank(txnDls: Int, val ifsc: String, add: String, id: Int): Bank(ifsc,add,id) {
    fun reverseTransac() {
        println("Performing reverse transction.")
    }

    override fun performTransaction(): String {
        return "In AbcBank"
    }
}

 data class Imp(  // data class must have one primary constructor.
    val siz: Int,
    val cloud: String,
    val lastUpdate: Date
    )
class DataManagement{
    var arr: ArrayList<Imp> = ArrayList()

    init {
        arr.add(Imp(5,"mnbv", Date(2021,10,6)))
        arr.add(Imp(4,"fjyf",Date(2021,3,4)))
        arr.add(Imp(7,"nbmn",Date(2020,9,16)))
    }
    fun greater(sz: Int) {
        arr.forEach {
            if (sz < it.siz){
                println("size - ${it.siz}  cloud - ${it.cloud}  date - ${it.lastUpdate}")
            }
        }
    }
    fun clud(cld: String) { // break is not allowed in forEach.
        arr.forEach{
            if(cld == it.cloud) {
                println("size - ${it.siz}  cloud - ${it.cloud}  date - ${it.lastUpdate}")
            }
//            else {
//                println("No such cloud available")
//            }
        }
    }
}







fun main() {
    // q1
//    val x: Array<Int> = q1(arrayOf<Int>(2,3,4), arrayOf<Int>(6,7,8))
//    for (i in x) {
//        println(i)
//    }
    // q2
//    val x = Scanner(System.`in`)
//    println("Enter size of 1st array")
//    val x1: IntArray = IntArray(x.nextInt())
//    println("Enter array elements")
//    // val x2: IntArray = intArrayOf()
//    for (i in x1.indices) {
//        x1[i] = x.nextInt()
//    }
//    println("Enter size of 2nd array")
//    val x2: IntArray = IntArray(x.nextInt())
//    println("Enter array elements")
//    for(i in x2.indices) {
//        x2[i] = x.nextInt()
//    }
//    println("Required array.....")
//    val x3: IntArray = q3(x1,x2)
//    for(i in x3){
//        print(" $i")
//    }
    // q4
//    println("Enter array size")
//    val x = Scanner(System.`in`)
//    val x1: Int = x.nextInt()
//    println("Enter array element")
//    val arr: Array<String> = Array<String>(x1){""}
//    for (i in 0 until x1) {
//        arr[i] = readLine().toString()
//    }
//    println("Enter index to remove")
//    val ind = x.nextInt()
//
////    println("Output.....")
////    arr.forEach {
////        println(it)
////    }
//
//    val arr1 = q4(arr,ind,x1)
//    arr1.map {
//        println(it)
//    }

    // q5
//    println("Enter ifsc code")
//    val v1: String = readLine().toString()
//    println("Enter address")
//    val v2: String = readLine().toString()
//    println("Enter id")
//    val v3: Int = readLine().toString().toInt()
//    val value = Bank(v1, v2, v3)
//    println(value.performTransaction())

    //q6

//    val x: DataManagement = DataManagement()
//    x.greater(5)
//    x.clud("mnbv")

    // q7



}
