package com.sfprojects.android.cryptocurrencyapp.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.sfprojects.android.cryptocurrencyapp.repository.DetailsActivityRepository

/**
 * Created by SFDevelop on 10/26/20.
 */
class DetailsActivityViewModel(application: Application) : AndroidViewModel(application){

    private val repository = DetailsActivityRepository(application)
}