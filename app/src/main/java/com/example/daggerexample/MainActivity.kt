package com.example.daggerexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject


class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegistrationService: UserRegistrationService

//    lateinit var emailService: EmailService
//    lateinit var emailService1: EmailService
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = (application as UserApplication).userRegistrationComponent
        component.inject(this)
        userRegistrationService.registerUser("cheezycode@gmail.com","1111")
    }
}