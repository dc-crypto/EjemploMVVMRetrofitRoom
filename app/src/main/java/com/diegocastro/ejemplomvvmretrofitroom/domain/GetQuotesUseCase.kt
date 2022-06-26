package com.diegocastro.ejemplomvvmretrofitroom.domain

import com.diegocastro.ejemplomvvmretrofitroom.data.QuoteRepository
import com.diegocastro.ejemplomvvmretrofitroom.data.model.QuoteModel
import javax.inject.Inject


class GetQuotesUseCase @Inject constructor(private val repository : QuoteRepository) {

    suspend operator fun invoke() : List<QuoteModel>?{
        return repository.getAllQuotes()
    }

}