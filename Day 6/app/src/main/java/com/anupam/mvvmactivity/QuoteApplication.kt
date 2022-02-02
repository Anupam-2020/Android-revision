package com.anupam.mvvmactivity

import android.app.Application
import com.anupam.mvvmactivity.Repository.QuoteRepository
import com.anupam.mvvmactivity.api.QuoteService
import com.anupam.mvvmactivity.api.RetrofitHelper
import com.anupam.mvvmactivity.db.QuoteDatabase


class QuoteApplication: Application() {

    lateinit var quoteRepository: QuoteRepository

    override fun onCreate() {
        super.onCreate()
        initialize()
    }

    private fun initialize() {
        val quoteService = RetrofitHelper.getInstance().create(QuoteService::class.java)
//        val database = QuoteDatabase.getDatabase(this)
        quoteRepository = QuoteRepository(quoteService,/*database*/)
    }
}