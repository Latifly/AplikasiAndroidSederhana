package com.example.proyekakhir_dicoding

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class Book(
    var name: String = "",
    var author: String = "",
    var genre: String = "",
    var publishedYear: Int = 0,
    var synopsis: String = "",
    var cover: Int = 0
): Parcelable