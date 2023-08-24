package com.mbyrapps.splashscreenanimatedcompose

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreem(
    navHostController: NavHostController
) {
    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) {
        NavGraph(navHostController = navHostController)
    }

}