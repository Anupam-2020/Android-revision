package com.anupam.shoppingcartapp.shoppingCartApp

import kotlin.properties.Delegates

class Item {

    var  id by Delegates.notNull<Int>()
    lateinit var name: String
    var quantity  = 0
    var price = 0.0
    var total = quantity * price

}