package com.anupam.retrofitexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.example.example.Results
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import okhttp3.Dispatcher

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val quotesApi = RetrofitHelper.getInstance().create(QuotesApi::class.java)
        CoroutineScope(Dispatchers.IO).launch {
            val result = quotesApi.getQuotes(1)
            if(result != null) {
//                Log.i("Retrofit",result.body().toString())
                val quoteList =  result.body()
                val text = findViewById<TextView>(R.id.textView)
                quoteList?.results?.forEach{
                    Log.i("Retrofit",it.content.toString())
                }
            }
        }
    }
}