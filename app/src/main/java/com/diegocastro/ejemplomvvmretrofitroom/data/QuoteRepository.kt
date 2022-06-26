package com.diegocastro.ejemplomvvmretrofitroom.data

import com.diegocastro.ejemplomvvmretrofitroom.data.model.QuoteModel
import com.diegocastro.ejemplomvvmretrofitroom.data.model.QuoteProvider
import com.diegocastro.ejemplomvvmretrofitroom.data.network.QuoteService

class QuoteRepository {

    private val api =QuoteService()

    suspend fun getAllQuotes(): List<QuoteModel> {
        val response = api.getQuotes()
        QuoteProvider.quotes = response
        return response

    }
}