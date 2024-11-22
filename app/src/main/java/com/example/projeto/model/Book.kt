package com.example.projeto.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Book (
    @PrimaryKey
    val id: String,
    val titulo: String,
    val autor: String,
    val imagem: String?
)
