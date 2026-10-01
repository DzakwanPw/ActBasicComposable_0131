package com.example.pampertemuan3.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun ContohColumn(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(text = "Latihan Column")
    }
}