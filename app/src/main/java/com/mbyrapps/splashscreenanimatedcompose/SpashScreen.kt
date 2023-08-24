package com.mbyrapps.splashscreenanimatedcompose

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.mbyrapps.splashscreenanimatedcompose.ui.theme.SplashScreenAnimatedComposeTheme
import kotlinx.coroutines.delay


@Composable
fun SplashScreen(
    navHostController: NavHostController
) {
    val splashTime = 3000
    var startAnimation by remember {
        mutableStateOf(false)
    }

    val alphaAnim by animateFloatAsState(
        targetValue = if (startAnimation) 1f else 0f,
        animationSpec = tween(
            durationMillis = splashTime
        ),
        label = ""
    )

    LaunchedEffect(key1 = true) {
        startAnimation = true
        delay(splashTime.toLong())
        navHostController.popBackStack()
        navHostController.navigate(Screen.Home.route)
    }


    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center,
    ) {
        Icon(
            modifier = Modifier
                .size(120.dp)
                .alpha(alphaAnim),
            imageVector = Icons.Default.Email,
            contentDescription = "Splash Screen Icon"
        )
    }

}


@Preview(showBackground = true)
@Composable
fun SplashScreenPreview() {
    SplashScreenAnimatedComposeTheme {
        SplashScreen(navHostController = rememberNavController())
    }
}