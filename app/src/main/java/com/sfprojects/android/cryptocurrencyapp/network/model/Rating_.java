
package com.sfprojects.android.cryptocurrencyapp.network.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Rating_ implements Serializable
{

    @SerializedName("Weiss")
    @Expose
    private Weiss_ weiss;
    private final static long serialVersionUID = 2940272000841603827L;

    public Weiss_ getWeiss() {
        return weiss;
    }

    public void setWeiss(Weiss_ weiss) {
        this.weiss = weiss;
    }

}
