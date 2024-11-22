package com.example.projeto.json.bookComplete.saleInfo

import com.example.projeto.json.bookComplete.saleInfo.offer.ListPriceInMicros
import com.example.projeto.json.bookComplete.saleInfo.offer.RetailPriceInMicros

class Offer(
    val finskyOfferType: Int,
    val listPrice: ListPriceInMicros,
    val retailPrice: RetailPriceInMicros,
    val giftable: Boolean
)