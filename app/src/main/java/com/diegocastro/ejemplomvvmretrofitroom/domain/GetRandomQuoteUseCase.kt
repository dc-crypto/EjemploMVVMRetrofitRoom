package com.diegocastro.ejemplomvvmretrofitroom.domain

import com.diegocastro.ejemplomvvmretrofitroom.data.QuoteRepository
import com.diegocastro.ejemplomvvmretrofitroom.data.model.QuoteModel
import com.diegocastro.ejemplomvvmretrofitroom.data.model.QuoteProvider

class GetRandomQuoteUseCase {

    private val repository = QuoteRepository()

    operator fun invoke(): QuoteModel? {
        val quotes = QuoteProvider.quotes
        if (!quotes.isNullOrEmpty()) {
            val randomNumber= (0..quotes.size - 1).random()
            return quotes[randomNumber]
        }
        return null
    }

}