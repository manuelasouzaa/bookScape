package com.example.projeto.json.bookComplete

import com.example.projeto.json.bookComplete.bookVolumeInfo.ImageLinks
import com.example.projeto.json.bookComplete.bookVolumeInfo.IndustryIdentifier
import com.example.projeto.json.bookComplete.bookVolumeInfo.PanelizationSummary
import com.example.projeto.json.bookComplete.bookVolumeInfo.ReadingMode
import com.example.projeto.json.bookComplete.bookVolumeInfo.author

class BookVolumeInfo(

//    @JsonProperty("title")
    val title: String,
    val authors: List<author>,
    val publisher: String,
    val publishedDate: String,
    val description: String,
    val industryIdentifiers: List<IndustryIdentifier>,
    val readingModes: ReadingMode,
    val pageCount: Int,
    val printType: String,
    val categories: List<String>,
    val maturityRating: String,
    val allowAnonLogging: Boolean,
    val contentVersion: String,
    val panelizationSummary: PanelizationSummary,
    val imageLinks: ImageLinks,
    val language: String,
    val previewLink: String,
    val infoLink: String,
    val cannonicalVolumeLink: String
)
