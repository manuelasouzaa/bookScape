package com.example.projeto.database


import com.example.projeto.json.BookComplete
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WebService {

    @GET("volumes")
    suspend fun buscaLivros(
        @Query("q") pesquisa: String
    ): Response<List<BookComplete>>

}
