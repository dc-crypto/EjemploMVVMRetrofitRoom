package com.diegocastro.ejemplomvvmretrofitroom.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.diegocastro.ejemplomvvmretrofitroom.data.model.QuoteModel
import com.diegocastro.ejemplomvvmretrofitroom.domain.GetQuotesUseCase
import com.diegocastro.ejemplomvvmretrofitroom.domain.GetRandomQuoteUseCase
import kotlinx.coroutines.launch
import kotlin.text.Typography.quote


class QuoteViewModel : ViewModel() {

    val quoteModel = MutableLiveData<QuoteModel>()
    val isLoading = MutableLiveData<Boolean>()
    var getQuotesUseCase = GetQuotesUseCase()
    var getRandomQuoteUseCase = GetRandomQuoteUseCase()


    fun onCreate() {
        viewModelScope.launch {
            isLoading.postValue(true)
            val result = getQuotesUseCase()
            if (!result.isNullOrEmpty()) {
                quoteModel.postValue(result[0])
                isLoading.postValue(false)
            }
        }

    }

    //Caso de uso que devuelva una cita random
    fun randomQuote() {
        isLoading.postValue(true)
        val quote = getRandomQuoteUseCase()
        if (quote != null) {
            quoteModel.postValue(quote)
        }
        isLoading.postValue(false)
    }
}