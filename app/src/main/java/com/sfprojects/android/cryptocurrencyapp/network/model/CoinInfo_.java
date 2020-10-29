
package com.sfprojects.android.cryptocurrencyapp.network.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CoinInfo_ implements Serializable
{

    @SerializedName("Id")
    @Expose
    private String id;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("FullName")
    @Expose
    private String fullName;
    @SerializedName("Internal")
    @Expose
    private String internal;
    @SerializedName("ImageUrl")
    @Expose
    private String imageUrl;
    @SerializedName("Url")
    @Expose
    private String url;
    @SerializedName("Algorithm")
    @Expose
    private String algorithm;
    @SerializedName("ProofType")
    @Expose
    private String proofType;
    @SerializedName("Rating")
    @Expose
    private Rating_ rating;
    @SerializedName("NetHashesPerSecond")
    @Expose
    private double netHashesPerSecond;
    @SerializedName("BlockNumber")
    @Expose
    private double blockNumber;
    @SerializedName("BlockTime")
    @Expose
    private double blockTime;
    @SerializedName("BlockReward")
    @Expose
    private double blockReward;
    @SerializedName("Type")
    @Expose
    private int type;
    @SerializedName("DocumentType")
    @Expose
    private String documentType;
    private final static long serialVersionUID = 9184662874326054065L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getInternal() {
        return internal;
    }

    public void setInternal(String internal) {
        this.internal = internal;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    public String getProofType() {
        return proofType;
    }

    public void setProofType(String proofType) {
        this.proofType = proofType;
    }

    public Rating_ getRating() {
        return rating;
    }

    public void setRating(Rating_ rating) {
        this.rating = rating;
    }

    public double getNetHashesPerSecond() {
        return netHashesPerSecond;
    }

    public void setNetHashesPerSecond(double netHashesPerSecond) {
        this.netHashesPerSecond = netHashesPerSecond;
    }

    public double getBlockNumber() {
        return blockNumber;
    }

    public void setBlockNumber(double blockNumber) {
        this.blockNumber = blockNumber;
    }

    public double getBlockTime() {
        return blockTime;
    }

    public void setBlockTime(double blockTime) {
        this.blockTime = blockTime;
    }

    public double getBlockReward() {
        return blockReward;
    }

    public void setBlockReward(double blockReward) {
        this.blockReward = blockReward;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

}
