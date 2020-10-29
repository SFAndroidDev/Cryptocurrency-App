package com.sfprojects.android.cryptocurrencyapp.repository

import android.app.Application
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import com.google.gson.Gson
import com.sfprojects.android.cryptocurrencyapp.network.BASE_URL
import com.sfprojects.android.cryptocurrencyapp.network.CurrenciesNetwork
import com.sfprojects.android.cryptocurrencyapp.network.model.Coin
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

    fun changeState(){
        showProgress.value = !(showProgress.value !=null && showProgress.value!!)
    }

    fun fetchTopCoins(){
        showProgress.value = true

        // Network call
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val service = retrofit.create(CurrenciesNetwork::class.java)

        service.getCryptoCurrencies().enqueue(object : Callback<List<Coin>>{
            override fun onResponse(
                call: Call<List<Coin>>,
                response: Response<List<Coin>>)
            {
                Log.i("RESPONSE_TAG", " Response : ${Gson().toJson(response.body())}")
                showProgress.value = false
            }

            override fun onFailure(call: Call<List<Coin>>, t: Throwable) {
                showProgress.value = false
                Toast.makeText(application, "Error to access the API",
                    Toast.LENGTH_SHORT)
                    .show()
            }
        })

    }
}