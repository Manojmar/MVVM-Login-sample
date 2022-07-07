package com.example.mvvmlogin.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmlogin.callback
import com.example.mvvmlogin.databinding.ActivityMainBinding
import com.example.mvvmlogin.viewmodel.LoginViewModelFactory
import com.example.mvvmlogin.viewmodel.Loginviewmodel

class MainActivity : AppCompatActivity(),callback {

    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mainBinding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        mainBinding.viewmodel= ViewModelProvider(this,LoginViewModelFactory(this))
            .get(Loginviewmodel::class.java)
    }

    override fun onSuccess(message: String) {
        Toast.makeText(this, "$message", Toast.LENGTH_SHORT).show()
    }

    override fun onError(message: String) {
        Toast.makeText(this, "$message", Toast.LENGTH_SHORT).show()
    }
}