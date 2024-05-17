package com.pk.Carrmunity.ui.theme.screens.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.pk.Carrmunity.navigation.ROUTE_LOGIN
import com.pk.Carrmunity.navigation.ROUTE_VIEW_UPLOADSES

@Composable
    fun HomeScreen(navController: NavHostController) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = "Welcome to Carmunnity",
                color = Color.White,
                fontFamily = FontFamily.Cursive,
                fontSize = 30.sp
            )
            Spacer(modifier = Modifier.height(50.dp))

            Button(
                onClick = { navController.navigate(ROUTE_LOGIN) },
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Text(text = "Want to import a car?")

            }
            Text(
                text = "OR",
                color = Color.White,
                fontFamily = FontFamily.Cursive,
                fontSize = 40.sp
            )
            Spacer(modifier = Modifier.height(50.dp))
            Button(
                onClick = { navController.navigate(ROUTE_VIEW_UPLOADSES) },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Want to buy local?")

            }

        }

    }
@Preview
@Composable
fun Homeprev() {
    HomeScreen(rememberNavController())
}