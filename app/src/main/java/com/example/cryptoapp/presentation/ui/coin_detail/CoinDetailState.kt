package com.example.cryptoapp.presentation.ui.coin_detail

import com.example.cryptoapp.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String =  ""
)
