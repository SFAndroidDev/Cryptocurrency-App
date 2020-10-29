
package com.sfprojects.android.cryptocurrencyapp.network.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum implements Serializable
{

    @SerializedName("CoinInfo")
    @Expose
    private CoinInfo_ coinInfo;
    @SerializedName("RAW")
    @Expose
    private RAW rAW;
    @SerializedName("DISPLAY")
    @Expose
    private DISPLAY dISPLAY;
    private final static long serialVersionUID = 2161655669550716388L;

    public CoinInfo_ getCoinInfo() {
        return coinInfo;
    }

    public void setCoinInfo(CoinInfo_ coinInfo) {
        this.coinInfo = coinInfo;
    }

    public RAW getRAW() {
        return rAW;
    }

    public void setRAW(RAW rAW) {
        this.rAW = rAW;
    }

    public DISPLAY getDISPLAY() {
        return dISPLAY;
    }

    public void setDISPLAY(DISPLAY dISPLAY) {
        this.dISPLAY = dISPLAY;
    }

}
