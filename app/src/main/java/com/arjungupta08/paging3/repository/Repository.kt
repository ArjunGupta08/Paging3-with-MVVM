package com.arjungupta08.paging3.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.liveData
import com.arjungupta08.paging3.model.QuoteList
import com.arjungupta08.paging3.paging.QuotePagingSource
import com.arjungupta08.paging3.retrofit.QuotesApi
import javax.inject.Inject

class Repository @Inject constructor(val quotesApi: QuotesApi) {

    fun getQuotes() = Pager(
        config = PagingConfig(20, 100),
        pagingSourceFactory = { QuotePagingSource(quotesApi) }
    ).liveData

}