package com.diegocastro.ejemplomvvmretrofitroom.data.network

import com.diegocastro.ejemplomvvmretrofitroom.core.RetrofitHelper
import com.diegocastro.ejemplomvvmretrofitroom.data.model.QuoteModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response

//esta clase permite devolver los datos tipo SOLID independiente del proveedor

class QuoteService {
    private val retrofit=RetrofitHelper.getRetrofit()

    suspend fun getQuotes(): List<QuoteModel> {
        return withContext(Dispatchers.IO) {
            val response = retrofit.create(QuoteApiClient::class.java).getAllQuotes()
            response.body() ?: emptyList()
        }
    }
}