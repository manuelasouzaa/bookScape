package com.example.projeto.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.projeto.contextExpresions.toast
import com.example.projeto.contextExpresions.vaiPara
import com.example.projeto.database.LibraryDatabase
import com.example.projeto.databinding.CadastroActivityBinding
import com.example.projeto.model.User
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.launch

class CadastroActivity: AppCompatActivity() {

    private val binding by lazy {
        CadastroActivityBinding.inflate(layoutInflater)
    }

    private val db by lazy {
        LibraryDatabase.instance(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val btn = binding.btnEntrar

        btn.setOnClickListener {
            lifecycleScope.launch(IO){
                criaUsuario()
            }
        }
    }

    private fun criaUsuario(): User {
        val email = binding.email.text.toString()
        val nome = binding.username.text.toString()
        val senha = binding.senha.text.toString()

        val novoUsuario = User(
            email = email,
            name = nome,
            password = senha
        )

        if (email == "" || senha == "") {
            lifecycleScope.launch(Main) {
                launch {
                    toast("Preencha todos os campos")
                }
            }
        } else {
            db.userDao().salva(novoUsuario)
            lifecycleScope.launch(Main) {
                launch {
                    toast("Cadastro realizado com sucesso!")
                }
            }
            vaiPara(LoginActivity::class.java, {
                novoUsuario
            })
        }

        return novoUsuario
    }
}