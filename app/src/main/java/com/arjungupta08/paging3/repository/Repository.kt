package com.arjungupta08.paging3.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.arjungupta08.paging3.model.QuoteList
import com.arjungupta08.paging3.retrofit.QuotesApi
import javax.inject.Inject

class Repository @Inject constructor(val quotesApi: QuotesApi) {

    private val mutableQuoteList = MutableLiveData<QuoteList>()
    val liveQuoteData : LiveData<QuoteList>
        get() = mutableQuoteList

    suspend fun getData() {
        val response = quotesApi.getQuotes()
        if (response.isSuccessful) {
            mutableQuoteList.postValue(response.body())
        }
    }
}