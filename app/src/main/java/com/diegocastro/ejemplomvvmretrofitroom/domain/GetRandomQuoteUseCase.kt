package com.diegocastro.ejemplomvvmretrofitroom.domain

import com.diegocastro.ejemplomvvmretrofitroom.data.QuoteRepository
import com.diegocastro.ejemplomvvmretrofitroom.data.model.QuoteModel
import com.diegocastro.ejemplomvvmretrofitroom.domain.model.Quote
import javax.inject.Inject

class GetRandomQuoteUseCase @Inject constructor(private val repository: QuoteRepository) {

    suspend operator fun invoke(): Quote? {
        val quotes = repository.getAllQuotesFromDataBase()
        if (!quotes.isNullOrEmpty()) {
            val randomNumber= (quotes.indices).random()
            return quotes[randomNumber]
        }
        return null
    }

}