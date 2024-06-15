package com.example.tripdrop.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.tripdrop.presentation.common.DetailsCard
import com.example.tripdrop.ui.theme.TripDropTheme

@Composable
fun HomeScreen(navController: NavController){
    Column {
        DetailsCard()
        DetailsCard()
        DetailsCard()
    }
}

@Preview
@Composable
fun HomeScreenPreview(){
    TripDropTheme {
        HomeScreen(navController = rememberNavController())
    }
}