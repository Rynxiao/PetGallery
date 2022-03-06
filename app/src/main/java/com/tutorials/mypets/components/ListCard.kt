package com.tutorials.mypets.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Pets
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tutorials.mypets.data.pets
import com.tutorials.mypets.model.Pet
import com.tutorials.mypets.ui.theme.fonts

@Composable
fun ListCard(
    modifier: Modifier = Modifier,
    pet: Pet = pets[0],
    onClick: (pet: Pet) -> Unit
) {
    Column(
        modifier = Modifier
            .padding(top = 20.dp, bottom = 20.dp)
            .background(MaterialTheme.colors.background),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        Surface(
            modifier = modifier.clickable { onClick(pet) },
            elevation = 10.dp,
            color = MaterialTheme.colors.onBackground,
            shape = RoundedCornerShape(20.dp)
        ) {
            Image(
                painter = painterResource(id = pet.samples[0].imageRes),
                contentDescription = pet.samples[0].name,
                contentScale = ContentScale.FillBounds
            )
        }
        Text(
            text = pet.species.name,
            fontSize = 20.sp,
            fontFamily = fonts,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 10.dp, bottom = 8.dp)
        )
        Row(verticalAlignment = Alignment.Top) {
            Icon(
                imageVector = Icons.Default.Pets,
                contentDescription = "pets",
                modifier = Modifier
                    .padding(end = 5.dp)
                    .size(16.dp),
                tint = Color.Green.copy(alpha = 0.5f)
            )
            Box(modifier = Modifier.width(140.dp)) {
                Text(
                    text = pet.description,
                    fontSize = 14.sp,
                    fontFamily = fonts,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
    }
}