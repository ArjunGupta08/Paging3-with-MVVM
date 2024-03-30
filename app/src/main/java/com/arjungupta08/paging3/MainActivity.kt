package com.arjungupta08.paging3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.arjungupta08.paging3.repository.Repository
import com.arjungupta08.paging3.viewmodel.MainViewModel
import com.arjungupta08.paging3.viewmodel.MainViewModelFactory
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel

    @Inject lateinit var mainViewModelFactory: MainViewModelFactory
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this, mainViewModelFactory)[MainViewModel::class.java]

        viewModel.getLiveQuotes.observe(this){
            Log.d("TAG", it.toString())
        }
    }

}