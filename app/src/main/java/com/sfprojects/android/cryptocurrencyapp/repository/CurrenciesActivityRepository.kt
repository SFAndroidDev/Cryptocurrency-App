package com.sfprojects.android.cryptocurrencyapp.repository

import android.app.Application
import androidx.lifecycle.MutableLiveData

/**
 * Created by SFDevelop on 10/26/20.
 */
class CurrenciesActivityRepository(application: Application) {

    val showProgress: MutableLiveData<Boolean>()
}