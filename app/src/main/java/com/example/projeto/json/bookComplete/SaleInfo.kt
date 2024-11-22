package com.example.projeto.json.bookComplete

import com.example.projeto.json.bookComplete.saleInfo.ListPrice
import com.example.projeto.json.bookComplete.saleInfo.Offer
import com.example.projeto.json.bookComplete.saleInfo.RetailPrice

class SaleInfo(
    val country: String,
    val saleability: String,
    val isEbook: Boolean,
    val listPrice: ListPrice,
    val retailPrice: RetailPrice,
    val buyLink: String,
    val offers: List<Offer>
)
