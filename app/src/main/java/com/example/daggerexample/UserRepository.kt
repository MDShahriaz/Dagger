package com.example.daggerexample

import android.util.Log

class UserRepository {
    fun saveUser(email:String,password:String){
        Log.d("MSG","User saved in DB")
    }
}