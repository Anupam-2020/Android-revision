package com.anupam.roomactivity.database

import androidx.lifecycle.LiveData
import com.anupam.roomactivity.database.User
import com.anupam.roomactivity.database.UserDao

class UserRepository(private val userDao: UserDao) {

    val readAllData: LiveData<List<User>> = userDao.readAllData()

    suspend fun addUser(user: User) {
        userDao.addUser(user)
    }
}