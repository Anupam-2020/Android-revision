package com.anupam.mvvmactivity.Repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.anupam.mvvmactivity.api.QuoteService
import com.anupam.mvvmactivity.db.QuoteDatabase
import com.anupam.mvvmactivity.models.QuoteList


// whatever end points of url are defined in the QuoteService(Interface), it will be called inside this fn.
// this repository will fetch the data.
class QuoteRepository(private val quoteService: QuoteService/*, private val quoteDatabase: QuoteDatabase*/) {

    private val quotesLiveData = MutableLiveData<QuoteList>()

    val quotes : LiveData<QuoteList>
    get() = quotesLiveData

    // view models will call this function whenever they'll need data
    suspend fun getQuotes(page: Int) {
        val result = quoteService.getQuotes(page)
        if(result?.body() != null) {
            // below code will push the data to live data
            quotesLiveData.postValue(result.body())
            // below code will add the data to database.
//            quoteDatabase.quoteDao().addQuotes(result.body()!!.results)
        }
    }
}