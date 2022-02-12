package com.anupam.dependencyactivity

import android.util.Log
import javax.inject.Inject

class UserRepository @Inject constructor() {
    fun saveUser(email: String, password: String) {
        Log.i("anupam","User Saved in DB")
    }
}