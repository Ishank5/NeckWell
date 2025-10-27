package com.humblecoders.neckwell

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TipsScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF5F5F5))
    ) {
        // Header
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF2196F3))
                .padding(vertical = 32.dp),
            contentAlignment = Alignment.Center
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    text = "💡 Tips",
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
                Text(
                    text = "Improve Your Posture",
                    fontSize = 18.sp,
                    color = Color.White.copy(alpha = 0.9f)
                )
            }
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            TipCard(
                icon = "🪑",
                title = "Sit Correctly",
                description = "Keep your back straight and shoulders relaxed. Your feet should be flat on the floor."
            )

            TipCard(
                icon = "💻",
                title = "Monitor Position",
                description = "Place your screen at eye level, about an arm's length away from your face."
            )

            TipCard(
                icon = "⏰",
                title = "Take Breaks",
                description = "Stand up and stretch every 30 minutes. Walk around for a few minutes."
            )

            TipCard(
                icon = "🧘",
                title = "Neck Exercises",
                description = "Gently tilt your head side to side and front to back to relieve tension."
            )

            TipCard(
                icon = "👁️",
                title = "Eye Level",
                description = "Keep your monitor at or slightly below eye level to avoid neck strain."
            )

            TipCard(
                icon = "💪",
                title = "Strengthen Core",
                description = "Strong core muscles help maintain good posture throughout the day."
            )

            TipCard(
                icon = "🛏️",
                title = "Sleep Right",
                description = "Use a supportive pillow that keeps your neck aligned with your spine."
            )

            TipCard(
                icon = "📱",
                title = "Phone Usage",
                description = "Hold your phone at eye level instead of looking down at it."
            )
        }
    }
}

@Composable
fun TipCard(
    icon: String,
    title: String,
    description: String
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        shape = RoundedCornerShape(12.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.Top
        ) {
            Text(
                text = icon,
                fontSize = 32.sp,
                modifier = Modifier.padding(end = 16.dp)
            )

            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = title,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 4.dp)
                )

                Text(
                    text = description,
                    fontSize = 14.sp,
                    color = Color.Gray,
                    lineHeight = 20.sp
                )
            }
        }
    }
}