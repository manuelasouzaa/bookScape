package com.example.projeto.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.projeto.databinding.SearchActivityBinding

class SearchActivity: AppCompatActivity() {

    private val binding by lazy {
        SearchActivityBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

}