
package com.sfprojects.android.cryptocurrencyapp.network.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DISPLAY implements Serializable
{

    @SerializedName("EUR")
    @Expose
    private EUR_ eUR;
    private final static long serialVersionUID = 3757692879116146270L;

    public EUR_ getEUR() {
        return eUR;
    }

    public void setEUR(EUR_ eUR) {
        this.eUR = eUR;
    }

}
