package com.example.pampertemuan3

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource

@Composable
fun TugasLogin(modifier: Modifier = Modifier) {
    Box(modifier = modifier.fillMaxSize()) {
        Image(

            painter = painterResource(id = R.drawable.images),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
    }

}