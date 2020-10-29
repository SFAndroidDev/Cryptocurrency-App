
package com.sfprojects.android.cryptocurrencyapp.network.model;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CoinResponse implements Serializable
{

    @SerializedName("Message")
    @Expose
    private String message;
    @SerializedName("Type")
    @Expose
    private int type;
    @SerializedName("SponsoredData")
    @Expose
    private List<SponsoredDatum> sponsoredData = null;
    @SerializedName("Data")
    @Expose
    private List<Datum> data = null;
    @SerializedName("RateLimit")
    @Expose
    private RateLimit rateLimit;
    @SerializedName("HasWarning")
    @Expose
    private boolean hasWarning;
    private final static long serialVersionUID = -4837687626072032323L;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public List<SponsoredDatum> getSponsoredData() {
        return sponsoredData;
    }

    public void setSponsoredData(List<SponsoredDatum> sponsoredData) {
        this.sponsoredData = sponsoredData;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public RateLimit getRateLimit() {
        return rateLimit;
    }

    public void setRateLimit(RateLimit rateLimit) {
        this.rateLimit = rateLimit;
    }

    public boolean isHasWarning() {
        return hasWarning;
    }

    public void setHasWarning(boolean hasWarning) {
        this.hasWarning = hasWarning;
    }

}
