package com.diegocastro.ejemplomvvmretrofitroom.domain

import com.diegocastro.ejemplomvvmretrofitroom.data.QuoteRepository
import com.diegocastro.ejemplomvvmretrofitroom.data.database.entities.toDataBase
import com.diegocastro.ejemplomvvmretrofitroom.data.model.QuoteModel
import com.diegocastro.ejemplomvvmretrofitroom.domain.model.Quote
import javax.inject.Inject


class GetQuotesUseCase @Inject constructor(private val repository : QuoteRepository) {

    suspend operator fun invoke() : List<Quote>{
        val quotes =repository.getAllQuotesFromApi()

        return if (quotes.isNotEmpty()) {
            repository.clearQuotes()
            repository.insertQuotes(quotes.map { it.toDataBase() })
             quotes
        } else {
            repository.getAllQuotesFromDataBase()
        }

    }

}