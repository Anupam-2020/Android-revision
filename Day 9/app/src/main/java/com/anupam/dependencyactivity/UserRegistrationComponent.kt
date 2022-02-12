package com.anupam.dependencyactivity

import dagger.Component


@Component
interface UserRegistrationComponent {

//    fun getUserRegistrationService(): UserRegistrationService
//
//    fun getEmailService(): EmailService

    fun inject(mainActivity: MainActivity)

}