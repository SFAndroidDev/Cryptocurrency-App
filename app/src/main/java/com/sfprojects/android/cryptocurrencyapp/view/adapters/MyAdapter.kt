package com.sfprojects.android.cryptocurrencyapp.view.adapters

import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.sfprojects.android.cryptocurrencyapp.R
import com.sfprojects.android.cryptocurrencyapp.network.model.Datum
import com.sfprojects.android.cryptocurrencyapp.view.activities.DetailsActivity
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.coin_layout.view.*

/**
 * Created by SFDevelop on 10/29/20.
 */
const val BASE_ICON_URL = "https://www.cryptocompare.com/"

class MyAdapter (val activity: Activity, var data: MutableList<Datum>) :
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    fun addItems(data: List<Datum>) {
        this.data.addAll(data)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.coin_layout, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindViews(activity = activity, datum = data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }

    class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindViews(activity: Activity, datum: Datum) {
            val coinIconImageView = this.itemView.iv_coin_icon as ImageView
            val coinPriceEurTextView = this.itemView.tv_coin_price_eur as TextView
            val coinNameTextView = this.itemView.tv_coin_name as TextView
            val coinSymbolTextView = this.itemView.tv_coin_symbol as TextView

            //coinIconImageView.drawable = datum.coinInfo.imageUrl as ImageView
            Picasso.get().load(BASE_ICON_URL + datum.coinInfo.imageUrl).into(coinIconImageView);
            coinNameTextView.text = datum.coinInfo.fullName
            coinSymbolTextView.text = datum.coinInfo.name
            coinPriceEurTextView.text = datum.display.eur.price

            itemView.setOnClickListener {
                val intent = Intent(activity, DetailsActivity::class.java)
                intent.putExtra("DATA_PASS_", datum)
                activity.startActivity(intent)
            }
        }
    }


}