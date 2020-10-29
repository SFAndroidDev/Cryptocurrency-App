package com.sfprojects.android.cryptocurrencyapp.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.sfprojects.android.cryptocurrencyapp.network.model.CoinResponse
import com.sfprojects.android.cryptocurrencyapp.repository.CurrenciesActivityRepository

/**
 * Created by SFDevelop on 10/26/20.
 */
class CurrenciesActivityViewModel(application: Application): AndroidViewModel(application) {

    private val repository = CurrenciesActivityRepository(application)
    val showProgress: LiveData<Boolean>
    val coinResponse : LiveData<CoinResponse>

    init{
        this.showProgress = repository.showProgress
        this.coinResponse = repository.coinResponse
    }

    fun changeState(){
        repository.changeState()
    }

    fun fetchTopCoins(page_no: Int){
        repository.fetchTopCoins(page_no)
    }
}