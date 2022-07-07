package com.example.mvvmlogin.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.example.mvvmlogin.R
import com.example.mvvmlogin.callback
import com.example.mvvmlogin.databinding.ActivityMainBinding
import com.example.mvvmlogin.viewmodel.LoginViewModelFactory
import com.example.mvvmlogin.viewmodel.Loginviewmodel

class MainActivity : AppCompatActivity(),callback {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val MainBinding=DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        MainBinding.viewmodel=ViewModelProviders.of(this,LoginViewModelFactory(this))
            .get(Loginviewmodel::class.java)
    }

    override fun onSuccess(message: String) {
        Toast.makeText(this, "$message", Toast.LENGTH_SHORT).show()
    }

    override fun onError(message: String) {
        Toast.makeText(this, "$message", Toast.LENGTH_SHORT).show()
    }
}