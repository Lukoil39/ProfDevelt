package com.example.practicearchi.search

import com.example.practicearchi.Meanings
import com.google.gson.annotations.SerializedName

class SearchResult(
    @field:SerializedName("text") val text: String?,
    @field:SerializedName("meanings") val meanings: List<Meanings>?
)
