package com.anupam.dependencyactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegistrationService: UserRegistrationService


    @Inject
    lateinit var emailService:EmailService




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        /*  // Manual dependency
        val userRepository = UserRepository()
        val emailService = EmailService()

        val userRegistrationService = UserRegistrationService(userRepository,emailService)
        userRegistrationService.registerUser("anupam@gmail.com","hello")
         */


        // Object creation using Dagger
        val component = DaggerUserRegistrationComponent.builder().build()
//        val userRegistrationService = component.getUserRegistrationService()
//        val emailService = component.getEmailService()

        userRegistrationService.registerUser("anupam@gmail.com","helloAndroid")
        component.inject(this)
        emailService.send("anupam@gm,ail.com","anupam@gm,ail.com","hello")



    }
}