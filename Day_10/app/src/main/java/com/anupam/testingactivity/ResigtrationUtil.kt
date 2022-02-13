package com.anupam.testingactivity

class RegistrationUtil {

    companion object {

        private val users = listOf("anupam","anand","rahul")
        fun validateUserRegistrationInput(
            userName: String,
            password: String,
            confirmedPassword: String
        ) : Boolean{
            if(userName.isEmpty() || password.isEmpty())
                return false
            if(userName in users)
                return false
            if(password != confirmedPassword) {
                return false
            }
            if(password.length < 2)
                return false
            return true
        }
    }
}