package com.example.mvvmlogin.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmlogin.view.MainActivity

class LoginViewModelFactory(private val listener: MainActivity):ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return Loginviewmodel(listener) as T
    }
}