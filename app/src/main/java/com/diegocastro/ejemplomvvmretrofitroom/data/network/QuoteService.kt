package com.diegocastro.ejemplomvvmretrofitroom.data.network

import com.diegocastro.ejemplomvvmretrofitroom.core.RetrofitHelper
import com.diegocastro.ejemplomvvmretrofitroom.data.model.QuoteModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response
import javax.inject.Inject

//esta clase permite devolver los datos tipo SOLID independiente del proveedor


class QuoteService @Inject constructor(private val api: QuoteApiClient) {

    suspend fun getQuotes(): List<QuoteModel> {
        return withContext(Dispatchers.IO) {
            val response = api.getAllQuotes()
            response.body() ?: emptyList()
        }
    }
}