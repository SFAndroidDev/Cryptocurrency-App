package com.sfprojects.android.cryptocurrencyapp.view.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.google.gson.Gson
import com.sfprojects.android.cryptocurrencyapp.R
import com.sfprojects.android.cryptocurrencyapp.network.model.Datum
import com.sfprojects.android.cryptocurrencyapp.view.adapters.BASE_ICON_URL
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val data = intent.getSerializableExtra("DATA_PASS_") as? Datum
        Log.d("DETAILS_TAG", "onCreate: ")
        val iconUrl: String = data!!.coinInfo.imageUrl
        val symbol: String = data.coinInfo.name
        val fullName: String = data.coinInfo.fullName
        val priceEur: String = data.display.eur.price
        val market: String = data.display.eur.market

        //tv_coin_details.text = Gson().toJson(data!!.display.eur)

        Picasso.get().load(BASE_ICON_URL + iconUrl).into(iv_icon)
        tv_symbol.text = symbol
        tv_full_name.text = fullName
        tv_price.text = priceEur
        tv_market.text = market

    }
}