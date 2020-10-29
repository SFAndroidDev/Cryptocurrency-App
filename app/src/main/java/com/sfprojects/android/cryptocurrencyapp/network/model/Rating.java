
package com.sfprojects.android.cryptocurrencyapp.network.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Rating implements Serializable
{

    @SerializedName("Weiss")
    @Expose
    private Weiss weiss;
    private final static long serialVersionUID = 8077629547084316822L;

    public Weiss getWeiss() {
        return weiss;
    }

    public void setWeiss(Weiss weiss) {
        this.weiss = weiss;
    }

}
