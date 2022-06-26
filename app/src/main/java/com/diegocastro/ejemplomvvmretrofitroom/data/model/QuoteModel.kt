package com.diegocastro.ejemplomvvmretrofitroom.data.model

import com.google.gson.annotations.SerializedName


//Este es el modelo de datos
data class QuoteModel(
@SerializedName("quote") val quote: String,
@SerializedName("author") val author: String
)
