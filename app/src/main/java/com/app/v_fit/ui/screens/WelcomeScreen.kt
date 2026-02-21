package com.app.v_fit.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.v_fit.ui.components.ButtonComponent
import com.app.v_fit.ui.theme.Blue1
import com.app.v_fit.ui.theme.GrayColor

@Composable
fun WelcomeScreen(onNext: () -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(30.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Spacer(modifier = Modifier.weight(1f))
            
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text = "V",
                    fontSize = 36.sp,
                    fontWeight = FontWeight.Bold,
                    color = Blue1
                )
                Text(
                    text = "Fit",
                    fontSize = 36.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
            }
            
            Text(
                text = "Everybody Can Train",
                fontSize = 18.sp,
                color = GrayColor,
                modifier = Modifier.padding(top = 5.dp)
            )

            Spacer(modifier = Modifier.weight(1f))

            ButtonComponent(
                value = "Get Started",
                onButtonClicked = {
                    onNext()
                }
            )
        }
    }
}
