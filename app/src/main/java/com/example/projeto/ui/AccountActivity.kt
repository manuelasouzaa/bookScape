package com.example.projeto.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.projeto.databinding.AccountActivityBinding

class AccountActivity: AppCompatActivity() {

    private val binding by lazy {
        AccountActivityBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

//        binding.nomeUsuario

    }

}