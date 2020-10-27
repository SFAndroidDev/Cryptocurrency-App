package com.sfprojects.android.cryptocurrencyapp.network

import com.sfprojects.android.cryptocurrencyapp.network.model.Coin
import retrofit2.Call
import retrofit2.http.GET

/**
 * Created by SFDevelop on 10/26/20.
 */
const val BASE_URL = "https://min-api.cryptocompare.com/data/top/"

interface CurrenciesNetwork {

    @GET("mktcapfull?tsym=EUR&page=20")
    fun getCryptoCurrencies(): Call<List<Coin>>
}