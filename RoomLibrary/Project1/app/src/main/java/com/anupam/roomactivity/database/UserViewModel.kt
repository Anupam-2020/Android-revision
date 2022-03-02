package com.anupam.roomactivity.database

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.anupam.roomactivity.database.User
import com.anupam.roomactivity.database.UserDatabase
import com.anupam.roomactivity.database.UserRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class UserViewModel(application: Application): AndroidViewModel(application) {
    // Role of view Model is to provide data to UI and survive configuration changes
    // A view Model acts as a communication center b/w repository and UI.
    // AndroidViewModel is different  from regular viewModel. Here application is required in constructor


    val readAllData: LiveData<List<User>>
    private val repository: UserRepository


    init {
        val userDao = UserDatabase.getDatabase(application).userDao()
        repository = UserRepository(userDao)
        readAllData = repository.readAllData
    }

    fun addUser(user: User){
        viewModelScope.launch(Dispatchers.IO) {
            repository.addUser(user)
        }
    }
}