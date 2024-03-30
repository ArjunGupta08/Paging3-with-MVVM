package com.arjungupta08.paging3.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.arjungupta08.paging3.model.QuoteList
import com.arjungupta08.paging3.repository.Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

class MainViewModel @Inject constructor(val repository: Repository) : ViewModel() {
    init {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                repository.getData()
            }
        }
    }

    val getLiveQuotes : LiveData<QuoteList>
        get() = repository.liveQuoteData

}