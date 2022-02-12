package com.anupam.newsapp


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.anupam.newsapp.RecyclerItems.NewsAdapter
import com.anupam.newsapp.dto.News
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {

    lateinit var adapter:NewsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val songs = listOf(
//            Songs("Hello","Just a description"),
//            Songs("Bye","Hello World")
//        )
//
//       val recId = findViewById<RecyclerView>(R.id.songList)
//        recId.layoutManager = LinearLayoutManager(this)
//        recId.adapter = MyAdapter(songs,this)


        getNews()
    }

    private fun getNews() {
        val news = NewService.newsInstance.getHeadLines("in")
        news.enqueue(object : Callback<News>{
            override fun onResponse(call: Call<News>, response: Response<News>) {
                val news = response.body()
                if(news != null) {
                    Log.i("RETROFIT",news.toString())
                    adapter = NewsAdapter(this@MainActivity,news.articles)
                    val recId = findViewById<RecyclerView>(R.id.songList)
                    recId.adapter = adapter
                    recId.layoutManager = LinearLayoutManager(this@MainActivity)

                }
            }

            override fun onFailure(call: Call<News>, t: Throwable) {
                Log.i("RETROFIT","Error in fetching news", t)
            }

        })
    }

}