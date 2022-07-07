package com.example.mvvmlogin

interface callback {
    fun onSuccess(message:String)
    fun onError(message:String)
}