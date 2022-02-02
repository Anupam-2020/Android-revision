package com.anupam.mvvmactivity.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.anupam.mvvmactivity.Repository.QuoteRepository
import com.anupam.mvvmactivity.models.QuoteList
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel(private val repository: QuoteRepository): ViewModel() {
    // as soon as our main viewmodel will load, we'll raise a request by calling our repository to get the data.
    init {
        CoroutineScope(Dispatchers.IO).launch {
            repository.getQuotes(1)
        }
    }

    // this below live data will get the data from QuoteRepository's live data and will pass the data to activity/fragment.
    val quotes: LiveData<QuoteList>
    get() = repository.quotes
}