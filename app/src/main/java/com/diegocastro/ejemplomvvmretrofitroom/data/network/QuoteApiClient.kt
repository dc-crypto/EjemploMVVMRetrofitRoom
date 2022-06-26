package com.diegocastro.ejemplomvvmretrofitroom.data.network

import com.diegocastro.ejemplomvvmretrofitroom.data.model.QuoteModel
import retrofit2.Response
import retrofit2.http.GET

interface QuoteApiClient {
    @GET("/.json")
    suspend fun getAllQuotes():Response<List<QuoteModel>>
}