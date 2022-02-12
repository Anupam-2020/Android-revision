package com.anupam.newsapp


//  https://newsapi.org/v2/top-headlines?country=us&category=business&apiKey=API_KEY
//  https://newsapi.org/v2/everything?q=tesla&from=2022-01-12&sortBy=publishedAt&apiKey=API_KEY




import com.anupam.newsapp.dto.News
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query


const val BASE_URL = "https://newsapi.org/"
const val API_KEY = "Your Api Key"


interface NewsInterface {

    @GET("/v2/top-headlines?apiKey=$API_KEY")
    fun getHeadLines(@Query("country") country: String): Call<News>
}


object NewService{
    val newsInstance: NewsInterface
    init {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        newsInstance = retrofit.create(NewsInterface::class.java)
    }
}