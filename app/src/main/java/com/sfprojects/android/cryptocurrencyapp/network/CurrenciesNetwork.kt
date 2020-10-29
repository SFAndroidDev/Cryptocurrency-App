package com.sfprojects.android.cryptocurrencyapp.network

import com.sfprojects.android.cryptocurrencyapp.network.model.CoinResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by SFDevelop on 10/26/20.
 */
const val BASE_URL = "https://min-api.cryptocompare.com/data/top/"

interface CurrenciesNetwork {

    @GET("mktcapfull?tsym=EUR")
    fun getCryptoCurrencies(@Query("page") page_no: Int): Call<CoinResponse>
}