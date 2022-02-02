package com.anupam.mvvmactivity.models

data class QuoteList (

 val count         : Int,
 val totalCount    : Int,
 val page          : Int,
 val totalPages    : Int,
 val lastItemIndex : Int,
 val results       : ArrayList<Results>

)