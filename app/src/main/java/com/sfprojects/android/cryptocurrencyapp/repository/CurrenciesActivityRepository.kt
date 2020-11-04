package com.sfprojects.android.cryptocurrencyapp.repository

import android.app.Application
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import com.google.gson.Gson
import com.sfprojects.android.cryptocurrencyapp.network.retrofit.BASE_URL
import com.sfprojects.android.cryptocurrencyapp.network.retrofit.CurrenciesNetwork
import com.sfprojects.android.cryptocurrencyapp.network.model.CoinResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by SFDevelop on 10/26/20.
 */
class CurrenciesActivityRepository(val application: Application) {

    val showProgress = MutableLiveData<Boolean>()
    val coinResponse = MutableLiveData<CoinResponse>()

    fun changeState(){
        showProgress.value = !(showProgress.value !=null && showProgress.value!!)
    }

    fun fetchTopCoins(page_no: Int){
        showProgress.value = true

        // Network call
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val service = retrofit.create(CurrenciesNetwork::class.java)

        service.getCryptoCurrencies(page_no).enqueue(object : Callback<CoinResponse> {
            override fun onResponse(
                call: Call<CoinResponse>,
                response: Response<CoinResponse>
            ) {
                if (response.isSuccessful) {
                    if (response.body() != null) {
                        Log.d("RESPONSE_TAG", " Response : ${Gson().toJson(response.body())}")
                        coinResponse.value = response.body();
                    } else {
                        Toast.makeText(application, "UnExpected Response", Toast.LENGTH_SHORT).show()
                    }
                } else {
                    Toast.makeText(application, response.message(), Toast.LENGTH_SHORT).show()
                }
                showProgress.value = false
            }

            override fun onFailure(call: Call<CoinResponse>, t: Throwable) {
                showProgress.value = false
                Toast.makeText(application, t.message, Toast.LENGTH_SHORT).show()
            }
        })

    }
}