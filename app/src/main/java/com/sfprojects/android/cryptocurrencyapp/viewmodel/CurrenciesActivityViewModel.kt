package com.sfprojects.android.cryptocurrencyapp.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.sfprojects.android.cryptocurrencyapp.repository.CurrenciesActivityRepository

/**
 * Created by SFDevelop on 10/26/20.
 */
class CurrenciesActivityViewModel(application: Application): AndroidViewModel(application) {

    val repository = CurrenciesActivityRepository(application)
    val showProgress: LiveData<Boolean>

    init{
        this.showProgress = repository.showProgress
    }

    fun changeState(){
        repository.changeState()
    }
}