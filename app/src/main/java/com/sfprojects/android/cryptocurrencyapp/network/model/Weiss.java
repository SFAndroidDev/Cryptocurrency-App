
package com.sfprojects.android.cryptocurrencyapp.network.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Weiss implements Serializable
{

    @SerializedName("Rating")
    @Expose
    private String rating;
    @SerializedName("TechnologyAdoptionRating")
    @Expose
    private String technologyAdoptionRating;
    @SerializedName("MarketPerformanceRating")
    @Expose
    private String marketPerformanceRating;
    private final static long serialVersionUID = 7163442259969859121L;

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getTechnologyAdoptionRating() {
        return technologyAdoptionRating;
    }

    public void setTechnologyAdoptionRating(String technologyAdoptionRating) {
        this.technologyAdoptionRating = technologyAdoptionRating;
    }

    public String getMarketPerformanceRating() {
        return marketPerformanceRating;
    }

    public void setMarketPerformanceRating(String marketPerformanceRating) {
        this.marketPerformanceRating = marketPerformanceRating;
    }

}
