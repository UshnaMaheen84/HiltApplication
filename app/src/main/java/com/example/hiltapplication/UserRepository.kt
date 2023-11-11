package com.example.hiltapplication

import android.util.Log
import javax.inject.Inject

interface UserRepository{
    fun saveUser(name:String)
}

class SqlRepository @Inject constructor() :UserRepository{
    override fun saveUser(name:String){
        Log.e("SqlRepository","SqlRepository "+name)
    }
}
class FirebaseRepository  @Inject constructor():UserRepository{
    override fun saveUser(name:String){
        Log.e("FirebaseRepository","FirebaseRepository "+name)
    }
}