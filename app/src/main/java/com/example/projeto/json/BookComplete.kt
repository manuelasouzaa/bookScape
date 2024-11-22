package com.example.projeto.json

import com.example.projeto.json.bookComplete.AccessInfo
import com.example.projeto.json.bookComplete.BookVolumeInfo
import com.example.projeto.json.bookComplete.SaleInfo
import com.example.projeto.json.bookComplete.SearchInfo

class BookComplete(
    val kind: String,
    val id: String,
    val etag: String,
    val selfLink: String,
    val volumeInfo: List<BookVolumeInfo>,
    val saleInfo: SaleInfo,
    val accessInfo: AccessInfo,
    val searchInfo: SearchInfo
)
