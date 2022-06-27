package com.diegocastro.ejemplomvvmretrofitroom.data

import com.diegocastro.ejemplomvvmretrofitroom.data.database.dao.QuoteDao
import com.diegocastro.ejemplomvvmretrofitroom.data.database.entities.QuoteEntity
import com.diegocastro.ejemplomvvmretrofitroom.data.model.QuoteModel
import com.diegocastro.ejemplomvvmretrofitroom.data.network.QuoteService
import com.diegocastro.ejemplomvvmretrofitroom.domain.model.Quote
import com.diegocastro.ejemplomvvmretrofitroom.domain.model.toDomain
import javax.inject.Inject

class QuoteRepository @Inject constructor(
    private val api : QuoteService,
    private val quoteDao: QuoteDao
    ) {

    suspend fun getAllQuotesFromApi(): List<Quote> {
        val response:List<QuoteModel> = api.getQuotes()
        return response.map {it.toDomain()}

    }
    suspend fun getAllQuotesFromDataBase(): List<Quote>{
        val response :List<QuoteEntity> =quoteDao.getAllQuotes()
            return response.map {it.toDomain()}
    }

    suspend fun insertQuotes(quotes:List<QuoteEntity>){
        quoteDao.insertAll(quotes)
    }

    suspend fun clearQuotes(){
        quoteDao.deleteAllQuotes()
    }

}