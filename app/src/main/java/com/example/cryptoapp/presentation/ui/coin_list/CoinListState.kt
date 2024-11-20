package com.example.cryptoapp.presentation.ui.coin_list

import com.example.cryptoapp.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String =  ""
)
