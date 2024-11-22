package com.example.projeto.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.UUID

@Entity
data class BookList (
    @PrimaryKey
    val idList: String = UUID.randomUUID().toString(),
    val emailUser: String,
    val list: List<Book>
)