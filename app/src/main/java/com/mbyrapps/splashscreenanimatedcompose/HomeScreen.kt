package com.mbyrapps.splashscreenanimatedcompose

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.mbyrapps.splashscreenanimatedcompose.ui.theme.SplashScreenAnimatedComposeTheme


@Composable
fun HomeScreen() {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            text = "Home",
            fontSize = 32.sp
        )
    }

}


@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    SplashScreenAnimatedComposeTheme {
        HomeScreen()
    }
}