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

/**
 * Created by SFDevelop on 10/29/20.
 */
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
        holder.bindViews(activity = activity, datum = data.get(position))
    }

    override fun getItemCount(): Int {
        return data.size
    }

    class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindViews(activity: Activity, datum: Datum) {
            val imageView = this.itemView.findViewById(R.id.iv_coin_icon) as ImageView
            val tv_coin_price_eur = this.itemView.findViewById(R.id.tv_coin_price_eur) as TextView
            val tv_coin_name = this.itemView.findViewById(R.id.tv_coin_name) as TextView

            tv_coin_name.text = datum.coinInfo.fullName + " (" + datum.coinInfo.name + ") "
            tv_coin_price_eur.text = datum.display.eur.price

            itemView.setOnClickListener {
                val intent = Intent(activity, DetailsActivity::class.java)
                intent.putExtra("DATA_PASS_", datum)
                activity.startActivity(intent)
            }
        }
    }


}