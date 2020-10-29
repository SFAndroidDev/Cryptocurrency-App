package com.sfprojects.android.cryptocurrencyapp.network

import retrofit2.Call
import retrofit2.http.GET

/**
 * Created by SFDevelop on 10/26/20.
 */
const val BASE_URL = "https://min-api.cryptocompare.com/data/top/"
const val API_KEY = "a0aa29cbb5149fbc4dd1e5a390412fc8fd997d9110802c869a65101be40e0aa7"

interface CurrenciesNetwork {

    @GET("mktcapfull?tsym=EUR&page=20&api_key=$API_KEY")
    fun getCryptoCurrencies(): Call<List<Coin>>
}