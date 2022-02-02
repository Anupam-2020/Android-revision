package com.anupam.mvvmactivity.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.anupam.mvvmactivity.Repository.QuoteRepository


// our view model is parameterised, so we need to define a factory with the reference same as viewmodel's parameters.
class MainViewModelFactory(private val repository: QuoteRepository): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(repository) as T
    }
}