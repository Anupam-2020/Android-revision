package com.anupam.shoppingcartapp

import kotlin.system.exitProcess

class MenuHelper {

    private val database = ArrayList<Item>()

    fun showMenu() {
        println("Action required......")
        println("1. Show Database \n2. Add item \n3. Remove item(s) \n4. Exit")
        performOperation()
    }

    private fun performOperation() {
        val choice = readLine()?.toInt()!!
        while(true) {
            when(choice) {
                1 -> "${displayDatabase()}"
                2 -> "${addItem()}"
                3 -> "${removeItem()}"
                else -> "${exitFromApp()}"
            }
        }
    }

    private fun exitFromApp() {
        exitProcess(0)
    }

    
    private fun addItem() {
        val it = Item()
        println("Enter item name")
        val nm: String = readLine().toString()
        println("Enter quantity")
        val quant = readLine()?.toInt()
        println("Enter item price")
        val pr = readLine()?.toDouble()

        it.id = (0..1000).random()
        it.name = nm
        if (quant != null) {
            it.quantity = quant
        }
        else it.quantity = 0

        if(pr != null) {
            it.price = pr
        }
        else it.price = 0.0

        it.total = pr!! * quant!!
        database.add(it)
        showMenu()
    }


    private fun removeItem() {
        println("Enter id to remove")
        val itmId = readLine()?.toInt()
        val itmRemove = database.find {
            it.id == itmId
        }
        println("Enter quantities to remove")
        val quant = readLine()?.toInt()
        if(quant == 1){
            database.remove(itmRemove)
        }
        else {
            if (quant != null) {
                if(quant < itmRemove?.quantity!!) {
                    itmRemove.quantity = itmRemove.quantity.minus(quant)
                    itmRemove.total = itmRemove.quantity * itmRemove.price
                }
                else
                    database.remove(itmRemove)
            }
        }
        showMenu()
    }

    private fun displayDatabase() {
        database.forEach{
            println("${it.id}  ${it.name} ${it.quantity} ${it.total}")
        }
        println("Total amount - ${totalAmount()}")
        showMenu()
    }

    private fun totalAmount(): Double {
        var tp = 0.0
        database.forEach{
            tp += it.total
        }
        return tp
    }

}