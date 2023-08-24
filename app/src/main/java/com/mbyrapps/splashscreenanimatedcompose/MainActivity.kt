package com.mbyrapps.splashscreenanimatedcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.mbyrapps.splashscreenanimatedcompose.ui.theme.SplashScreenAnimatedComposeTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SplashScreenAnimatedComposeTheme {
                val navHostController = rememberNavController()
                MainScreem(navHostController = navHostController)
            }
        }
    }
}
