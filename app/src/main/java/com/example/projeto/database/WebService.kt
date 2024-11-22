package com.example.projeto.database


import com.example.projeto.model.Book
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WebService {

    @GET("volumes?q={pesquisa}")
    fun buscaLivros(
        @Query("pesquisa") pesquisa: String
    ): Response<List<Book>>

}
