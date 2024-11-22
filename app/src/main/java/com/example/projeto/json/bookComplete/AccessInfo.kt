package com.example.projeto.json.bookComplete

import com.example.projeto.json.bookComplete.accessInfo.FileType

class AccessInfo(
    val country: String,
    val viewability: String,
    val embeddable: Boolean,
    val publicDomain: Boolean,
    val textToSpeechPermission: String,
    val epub: FileType,
    val pdf: FileType,
    val webReaderLink: String,
    val accessViewStatus: String,
    val quoteSharingAllowed: Boolean
)
