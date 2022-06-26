package com.diegocastro.ejemplomvvmretrofitroom.data

import com.diegocastro.ejemplomvvmretrofitroom.data.model.QuoteModel
import com.diegocastro.ejemplomvvmretrofitroom.data.model.QuoteProvider
import com.diegocastro.ejemplomvvmretrofitroom.data.network.QuoteService
import javax.inject.Inject

class QuoteRepository @Inject constructor(private val api : QuoteService, private val quoteProvider: QuoteProvider) {

    suspend fun getAllQuotes(): List<QuoteModel> {
        val response = api.getQuotes()
        quoteProvider.quotes = response
        return response

    }
}