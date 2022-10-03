package com.example.daggerexample

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

interface UserRepository{
    fun saveUser(email:String,password:String)
}

@ActivityScope
class SQLRepository @Inject constructor(val analyticsService: AnalyticsService):UserRepository {
    override fun saveUser(email:String, password:String){
        Log.d("MSG","User saved in DB")
        analyticsService.trackEvent("save user in DB","create")
    }
}

class FirebaseRepository(val analyticsService: AnalyticsService):UserRepository{
    override fun saveUser(email: String, password: String) {
        Log.d("MSG","User saved in Firebase")
        analyticsService.trackEvent("save User in Firebase","create")
    }
}