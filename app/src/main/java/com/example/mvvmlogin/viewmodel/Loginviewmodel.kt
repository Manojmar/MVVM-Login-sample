package com.example.mvvmlogin.viewmodel

import android.text.Editable
import android.text.TextWatcher
import android.view.View
import androidx.lifecycle.ViewModel
import com.example.mvvmlogin.callback
import com.example.mvvmlogin.model.User

class Loginviewmodel(private val listerner: callback):ViewModel() {

    private var user: User

    init {
        this.user=User("","")
    }

    val emailTextWatcher:TextWatcher
    get() = object :TextWatcher{
        override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

        }

        override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

        }

        override fun afterTextChanged(p0: Editable?) {
           user.setEmail(p0.toString())
        }
    }

    val passwordTextWatcher:TextWatcher
    get() = object :TextWatcher{
        override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

        }

        override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

        }

        override fun afterTextChanged(p0: Editable?) {
            user.setPassword(p0.toString())
        }
    }

    fun onLoginClicked(v: View){
        if (user.isDataValid)
            listerner.onSuccess("Login Success")
        else
            listerner.onError("Login Error")
    }

}