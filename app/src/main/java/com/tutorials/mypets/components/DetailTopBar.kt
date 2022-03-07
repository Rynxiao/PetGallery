package com.tutorials.mypets.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.tutorials.mypets.ui.theme.fonts

@Composable
fun DetailTopBar(navController: NavController, species: String?) {
    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .clickable(
                indication = null,
                interactionSource = remember {
                    MutableInteractionSource()
                }) {
                navController.popBackStack()
            }
            .padding(vertical = 15.dp)
    ) {
        Icon(
            modifier = Modifier.width(48.dp),
            imageVector = Icons.Default.ArrowBack,
            contentDescription = "Back",
            tint = MaterialTheme.colors.primary
        )
        Text(
            text = species ?: "Species",
            fontFamily = fonts,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )
    }
}

@Composable
fun DetailLabel(title: String, content: String) {
    Surface(
        modifier = Modifier
            .width(110.dp)
            .padding(end = 15.dp),
        border = BorderStroke(1.dp, color = Color.LightGray),
        shape = RoundedCornerShape(8.dp),
    ) {
        Column(
            modifier = Modifier
                .padding(vertical = 8.dp)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = title,
                fontSize = 14.sp,
                fontFamily = fonts,
                color = Color.DarkGray.copy(alpha = 0.8f)
            )
            Text(text = content, fontSize = 18.sp, fontFamily = fonts)
        }
    }
}