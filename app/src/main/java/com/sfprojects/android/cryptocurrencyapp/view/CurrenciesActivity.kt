package com.sfprojects.android.cryptocurrencyapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.GONE
import android.view.View.VISIBLE
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.sfprojects.android.cryptocurrencyapp.R
import com.sfprojects.android.cryptocurrencyapp.viewmodel.CurrenciesActivityViewModel
import kotlinx.android.synthetic.main.activity_currencies.*

class CurrenciesActivity : AppCompatActivity() {

    private lateinit var viewModel: CurrenciesActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_currencies)

        viewModel = ViewModelProvider(this)
            .get(CurrenciesActivityViewModel::class.java)

        btn_start.setOnClickListener{
            viewModel.changeState()
        }


        viewModel.showProgress.observe(this, Observer{
            if (it){
                pb_currencies_list.visibility = VISIBLE
            }
            else{
                pb_currencies_list.visibility = GONE
            }
        })
    }
}