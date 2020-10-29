package com.sfprojects.android.cryptocurrencyapp.view.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.GONE
import android.view.View.VISIBLE
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sfprojects.android.cryptocurrencyapp.R
import com.sfprojects.android.cryptocurrencyapp.network.model.CoinResponse
import com.sfprojects.android.cryptocurrencyapp.view.adapters.MyAdapter
import com.sfprojects.android.cryptocurrencyapp.view.adapters.PaginationScrollListener
import com.sfprojects.android.cryptocurrencyapp.viewmodel.CurrenciesActivityViewModel
import kotlinx.android.synthetic.main.activity_currencies.*

class CurrenciesActivity : AppCompatActivity() {

    private lateinit var viewModel: CurrenciesActivityViewModel
    lateinit var adapter: MyAdapter
    lateinit var dialogLoader: DialogLoader
    private var pageNumber: Int = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_currencies)

        viewModel = ViewModelProvider(this)
            .get(CurrenciesActivityViewModel::class.java)

        viewModel.fetchTopCoins(pageNumber) //Loading the data from API

        viewModel.showProgress.observe(this, Observer{
            if (it){
                pb_currencies_list.visibility = VISIBLE
            }
            else{
                pb_currencies_list.visibility = GONE
            }
        })

        viewModel.coinResponse.observe(this, Observer{
            if (it != null){
                if (pageNumber == 1){
                    setupRecyclerView(it)
                }
                else{
                    dialogLoader.hideProgressDialog();
                    adapter.addItems(it.data)
                }
            }
        })
    }

    private fun setupRecyclerView(coinResponse: CoinResponse) {
        val recyclerView: RecyclerView = findViewById(R.id.rv_currencies_list)
        val layoutManager: LinearLayoutManager =
            LinearLayoutManager(this, RecyclerView.VERTICAL, false)

        adapter = MyAdapter(this, coinResponse.data)
        recyclerView.adapter = adapter;
        recyclerView.layoutManager = layoutManager


        var isLastPage: Boolean = false
        var isLoading: Boolean = false

        recyclerView.addOnScrollListener(object : PaginationScrollListener(layoutManager) {
            override fun isLastPage(): Boolean {
                return isLastPage
            }

            override fun isLoading(): Boolean {
                return isLoading
            }

            override fun loadMoreItems() {
                isLoading = true
                //you have to call loadmore items to get more data
                pageNumber ++
                viewModel.fetchTopCoins(pageNumber)
                dialogLoader.showProgressDialog();
            }
        })

    }
}