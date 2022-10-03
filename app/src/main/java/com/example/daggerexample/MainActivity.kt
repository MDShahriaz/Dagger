package com.example.daggerexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userRegistrationService = DaggerUserRegistrationComponent.builder().build().getUserRegistrationService()
        userRegistrationService.registerUser("cheezycode@gmail.com","1111")
    }
}