package com.anupam.dependencyactivity

import android.util.Log
import javax.inject.Inject

class UserRegistrationService
@Inject constructor(
    private val userRepository: UserRepository,
    private val emailService: EmailService
) {

    fun registerUser(email: String, password: String) {
        userRepository.saveUser(email,password)
        emailService.send(email,"anupam@gmail.com","hello")
    }
}


interface NotificationService{
    fun send(to: String, from: String, body: String)
}


class EmailService
@Inject constructor():NotificationService {
    override fun send(to: String, from: String, body: String) {
        Log.i("anupam","email sent")
    }
}


class MessageService: NotificationService {
    override fun send(to: String, from: String, body: String) {
        Log.i("anupam","Message sent")
    }
}