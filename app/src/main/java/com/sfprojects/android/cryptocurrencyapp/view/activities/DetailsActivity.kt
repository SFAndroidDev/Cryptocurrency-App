package com.sfprojects.android.cryptocurrencyapp.view.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.gson.Gson
import com.sfprojects.android.cryptocurrencyapp.R
import com.sfprojects.android.cryptocurrencyapp.network.model.Datum
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val data = intent.getSerializableExtra("DATA_PASS_") as? Datum

        Log.d("DETAILS_TAG", "onCreate: ")

        tv_coin_details.text = Gson().toJson(data!!.display.eur)
    }
}