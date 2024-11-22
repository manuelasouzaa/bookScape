package com.example.projeto.ui

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.projeto.database.Retrofit
import com.example.projeto.databinding.ActivityMainBinding
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        val search = binding.editText.text;


        binding.search.setOnClickListener {
            lifecycleScope.launch(IO) {
                launch {
                    try {

                        val lista = Retrofit().webService.buscaLivros(search.toString())
                        Log.i("Resultado", "onCreate: $lista")

                    } catch (e: Exception) {

                        Log.e("TAG", "onCreate: falha", e)

                    }
                }
            }
        }

    //  chave api = AIzaSyBD8He6r1sESa1GIpK0Ei61kwJ0_7QbgMs

    }

}