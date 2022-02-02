package com.anupam.mvvmactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.anupam.mvvmactivity.Repository.QuoteRepository
import com.anupam.mvvmactivity.api.QuoteService
import com.anupam.mvvmactivity.api.RetrofitHelper
import com.anupam.mvvmactivity.viewmodels.MainViewModel
import com.anupam.mvvmactivity.viewmodels.MainViewModelFactory

class MainActivity : AppCompatActivity() {

    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        // here we have created the object of view model.
//        val quoteService = RetrofitHelper.getInstance().create(QuoteService::class.java)
//        val repository = QuoteRepository(quoteService)

        // the above commented code has been shifted to application class.
        val repository = (application as QuoteApplication).quoteRepository
        mainViewModel = ViewModelProvider(this,MainViewModelFactory(repository))[MainViewModel::class.java]

        // accessing the live data of mainViewModel class.
        mainViewModel.quotes.observe(this, {
            Log.i("quotesData", it.results.toString())
        })
    }
}