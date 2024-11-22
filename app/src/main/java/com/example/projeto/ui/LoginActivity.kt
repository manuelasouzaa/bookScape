package com.example.projeto.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.projeto.contextExpresions.toast
import com.example.projeto.contextExpresions.vaiPara
import com.example.projeto.database.LibraryDatabase
import com.example.projeto.databinding.LoginActivityBinding
import com.example.projeto.model.User
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class LoginActivity : AppCompatActivity() {

    private val binding by lazy {
        LoginActivityBinding.inflate(layoutInflater)
    }

    private val db by lazy {
        LibraryDatabase.instance(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        configuraBotaoEntrar()
    }

    private fun configuraBotaoEntrar() {
        binding.btnEntrar.setOnClickListener {
            val email = binding.email.text.toString()
            val senha = binding.senha.text.toString()
            lifecycleScope.launch(IO) {
                launch {
                    autentica(email, senha)
                }
            }
        }
    }

    private suspend fun autentica(email: String, senha: String) {
        val usuarioEncontrado = db.userDao().buscaUsuario(email, senha)

        usuarioEncontrado?.let {
            vaiPara(MainActivity::class.java)
            finish()
        } ?: run {
            withContext(Main.immediate) {
                toast("Usuário não encontrado. Faça o cadastro")
            }
        }
    }
}