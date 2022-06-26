package com.diegocastro.ejemplomvvmretrofitroom.data.model


//Esta clase emula a retrofit o room
class QuoteProvider {
    companion object {
        var quotes: List<QuoteModel> = emptyList()
    }
}