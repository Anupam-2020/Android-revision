package com.anupam.mvvmactivity.api

import com.anupam.mvvmactivity.models.QuoteList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

// this QuoteService will hit the api.
interface QuoteService {

    @GET("/quotes")
    suspend fun getQuotes(@Query("page") page: Int): Response<QuoteList>
}