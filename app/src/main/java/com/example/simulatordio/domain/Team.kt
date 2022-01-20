package com.example.simulatordio.domain

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Team(
    @SerializedName("nome")
    val nome: String,
    @SerializedName("forca")
    val stars: Int,
    @SerializedName("imagem")
    val imagem: String,
    var score: Int?
): Parcelable