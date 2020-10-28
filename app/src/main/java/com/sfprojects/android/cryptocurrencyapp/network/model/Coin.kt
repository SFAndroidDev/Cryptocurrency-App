package com.sfprojects.android.cryptocurrencyapp.network.model

data class Coin(
    val Algorithm: String,
    val FullName: String,
    val Id: String,
    val ImageUrl: String,
    val Internal: String,
    val Name: String,
    val ProofType: String,
    val Rating: Rating,
    val Url: String
)