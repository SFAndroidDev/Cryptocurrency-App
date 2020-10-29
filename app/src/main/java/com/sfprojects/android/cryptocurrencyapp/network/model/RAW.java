
package com.sfprojects.android.cryptocurrencyapp.network.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RAW implements Serializable
{

    @SerializedName("EUR")
    @Expose
    private EUR eUR;
    private final static long serialVersionUID = -6654224163908667534L;

    public EUR getEUR() {
        return eUR;
    }

    public void setEUR(EUR eUR) {
        this.eUR = eUR;
    }

}
