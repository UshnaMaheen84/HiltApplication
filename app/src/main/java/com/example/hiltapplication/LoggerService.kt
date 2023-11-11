package com.example.hiltapplication

import android.util.Log
import javax.inject.Inject

class LoggerService @Inject constructor(){

    fun log(name:String){
        Log.e("testing","successful"+ " "+ name)
    }
}