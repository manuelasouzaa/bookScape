package com.example.projeto.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.Companion.REPLACE
import androidx.room.Query
import com.example.projeto.model.User

@Dao
interface UserDao {

    @Insert (onConflict = REPLACE)
    fun salva(user: User)

    @Query ("SELECT * FROM User WHERE email = :email AND password = :senha")
    fun buscaUsuario(email: String, senha: String): User?
}