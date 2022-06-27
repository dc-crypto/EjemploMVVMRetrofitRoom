package com.diegocastro.ejemplomvvmretrofitroom.domain.model

import com.diegocastro.ejemplomvvmretrofitroom.data.database.entities.QuoteEntity
import com.diegocastro.ejemplomvvmretrofitroom.data.model.QuoteModel

data class Quote (val quote:String,val author: String)

fun QuoteModel.toDomain()=Quote(quote,author)
fun QuoteEntity.toDomain()=Quote(quote,author)