package com.sfprojects.android.cryptocurrencyapp.network.model

data class Coin(
    val blockNumber: Int,
    val blockReward: Int,
    val blockTime: Int,
    val documentType: String,
    val fullName: String,
    val imageUrl: String,
    val netHashesPerSecond: Int,
    val rating: Rating,
    val type: Int,
    val url: String,
    val id: String,
    val name: String
)