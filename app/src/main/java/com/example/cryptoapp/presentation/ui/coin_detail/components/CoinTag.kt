package com.example.cryptoapp.presentation.ui.coin_detail.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun CoinTag(
    tag: String
) {
    Box(
        modifier = Modifier
            .padding(5.dp)
            .border(
                width = 1.dp,
                color = Color(0xFF5E5D5D),
                shape = RoundedCornerShape(50.dp)
            )
            .padding(10.dp)
    ) {
        Text(
            text = tag,
            color = Color(0xFFF8F8F8),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.bodyMedium
        )
    }
}

@Preview
@Composable
private fun CoinTagPreview() {
    CoinTag("Bitcoin")
}