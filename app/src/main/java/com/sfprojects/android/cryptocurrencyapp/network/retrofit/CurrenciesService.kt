package com.sfprojects.android.cryptocurrencyapp.network.retrofit

import com.sfprojects.android.cryptocurrencyapp.network.model.CoinResponse
import io.reactivex.rxjava3.core.Observable
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by SFDevelop on 10/26/20.
 */
const val BASE_URL = "https://min-api.cryptocompare.com/data/top/"
const val API_KEY = "a0aa29cbb5149fbc4dd1e5a390412fc8fd997d9110802c869a65101be40e0aa7"

interface CurrenciesNetwork {

    @GET("mktcapfull?tsym=EUR&api_key=$API_KEY")
    fun getCryptoCurrencies(@Query("page") page_no: Int): Call<CoinResponse>
}