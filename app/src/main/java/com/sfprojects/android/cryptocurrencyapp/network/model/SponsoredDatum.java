
package com.sfprojects.android.cryptocurrencyapp.network.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SponsoredDatum implements Serializable
{

    @SerializedName("CoinInfo")
    @Expose
    private CoinInfo coinInfo;
    private final static long serialVersionUID = 145412472770559188L;

    public CoinInfo getCoinInfo() {
        return coinInfo;
    }

    public void setCoinInfo(CoinInfo coinInfo) {
        this.coinInfo = coinInfo;
    }

}
