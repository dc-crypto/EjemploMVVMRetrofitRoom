package com.diegocastro.ejemplomvvmretrofitroom.data.model

import com.diegocastro.ejemplomvvmretrofitroom.data.network.QuoteService
import javax.inject.Inject
import javax.inject.Singleton


//Esta clase emula a retrofit o room
@Singleton
class QuoteProvider @Inject constructor() {
    var quotes: List<QuoteModel> = emptyList()
}