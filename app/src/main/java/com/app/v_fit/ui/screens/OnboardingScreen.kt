package com.app.v_fit.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.v_fit.ui.theme.Blue1
import com.app.v_fit.ui.theme.Blue2
import com.app.v_fit.ui.theme.GrayColor
import com.app.v_fit.ui.theme.WhiteColor

data class OnboardingPageData(
    val title: String,
    val description: String,
    val image: Int
)

@Composable
fun OnboardingScreen() {
    var currentPage by remember { mutableStateOf(0) }
    
    val pages = listOf(
        OnboardingPageData(
            "Track Your Goal",
            "Don't worry if you have trouble determining your goals, We can help you determine your goals and track your goals",
            0
        ),
        OnboardingPageData(
            "Get Burn",
            "Let’s keep burning, to achieve yours goals, it only hurts only for a second, if you give up now you will be in pain forever",
            0
        ),
        OnboardingPageData(
            "Eat Well",
            "Let's start a healthy lifestyle with us, we can determine your diet every day. healthy eating is fun",
            0
        ),
        OnboardingPageData(
            "Improve Sleep Quality",
            "Improve the quality of your sleep with us, good quality sleep can bring a good mood in the morning",
            0
        )
    )

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(WhiteColor)
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            // Placeholder for Image Area
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(400.dp)
                    .background(GrayColor.copy(alpha = 0.1f))
            )
            
            Spacer(modifier = Modifier.height(64.dp))

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 30.dp)
            ) {
                Text(
                    text = pages[currentPage].title,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
                
                Spacer(modifier = Modifier.height(15.dp))
                
                Text(
                    text = pages[currentPage].description,
                    fontSize = 14.sp,
                    color = GrayColor,
                    lineHeight = 21.sp
                )
            }
        }

        FloatingActionButton(
            onClick = {
                if (currentPage < pages.size - 1) {
                    currentPage++
                } else {
                    // Navigate to Registration
                }
            },
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(30.dp),
            shape = CircleShape,
            containerColor = Color.Transparent,
            contentColor = WhiteColor
        ) {
            Box(
                modifier = Modifier
                    .size(60.dp)
                    .background(
                        brush = Brush.horizontalGradient(listOf(Blue1, Blue2)),
                        shape = CircleShape
                    ),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.Default.ArrowForward,
                    contentDescription = "Next"
                )
            }
        }
    }
}
