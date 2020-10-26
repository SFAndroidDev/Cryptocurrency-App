package com.sfprojects.android.cryptocurrencyapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.sfprojects.android.cryptocurrencyapp.R
import com.sfprojects.android.cryptocurrencyapp.viewmodel.CurrenciesActivityViewModel

class CurrenciesActivity : AppCompatActivity() {

    private lateinit var viewModel: CurrenciesActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_currencies)

        viewModel = ViewModelProvider(this)
            .get(CurrenciesActivityViewModel::class.java)


    }
}