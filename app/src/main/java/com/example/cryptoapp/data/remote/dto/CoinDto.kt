package com.example.cryptoapp.data.remote.dto

import com.example.cryptoapp.domain.model.Coin
import com.google.gson.annotations.SerializedName

data class CoinDto(
    val id: String,
    @SerializedName("is_active")
    val isActive: Boolean,
    @SerializedName("is_new")
    val isNew: Boolean,
    val name: String,
    val symbol: String,
    val type: String
)

fun CoinDto.toCoin(): Coin {
    return Coin(
        id = id,
        isActive = isActive,
        name = name,
        symbol = symbol
    )
}