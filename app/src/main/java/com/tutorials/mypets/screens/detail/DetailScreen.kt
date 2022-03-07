package com.tutorials.mypets.screens.detail

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.google.accompanist.pager.ExperimentalPagerApi
import com.tutorials.mypets.components.Pager
import com.tutorials.mypets.data.pets
import com.tutorials.mypets.model.ImageRes
import com.tutorials.mypets.model.Species
import com.tutorials.mypets.ui.theme.fonts
import kotlinx.coroutines.coroutineScope

@ExperimentalPagerApi
@Preview
@Composable
fun DetailScreen(
    navController: NavController = NavController(LocalContext.current),
    species: String? = Species.Akita.name
) {
    Scaffold(
        topBar = { DetailTopBar(navController = navController, species = species) }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colors.background)
                .padding(horizontal = 20.dp)
        ) {
            val pet = pets.find { pet -> pet.species.name == species }

            pet?.let { foundedPet ->
                Pager(
                    modifier = Modifier
                        .padding(top = 10.dp)
                        .fillMaxWidth()
                        .height(250.dp)
                        .scale(scaleX = 0.95f, scaleY = 1.0f),
                    list = foundedPet.samples,
                    imageRadius = 15.dp
                ) { sample ->
                    Image(
                        modifier = Modifier.fillMaxSize(),
                        painter = painterResource(id = (sample as ImageRes).imageRes),
                        contentDescription = "img husky",
                        contentScale = ContentScale.FillBounds
                    )
                    Text(
                        modifier = Modifier.offset(20.dp, 200.dp),
                        text = sample.name,
                        color = Color.White,
                        fontFamily = fonts,
                        fontSize = 18.sp,
                    )
                    Text(
                        modifier = Modifier.offset(20.dp, 220.dp),
                        text = sample.brief,
                        color = Color.White,
                        fontFamily = fonts,
                        fontSize = 14.sp,
                        overflow = TextOverflow.Ellipsis
                    )
                }
            }

            species?.let { species ->
                Text(
                    modifier = Modifier.padding(vertical = 5.dp),
                    text = species,
                    fontFamily = fonts,
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp
                )
            }

            pet?.let { foundedPet ->
                Text(
                    text = foundedPet.description,
                    style = MaterialTheme.typography.body2,
                    fontFamily = fonts
                )
            }
        }
    }
}

@Composable
fun DetailTopBar(navController: NavController, species: String?) {
    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .padding(vertical = 15.dp)
            .clickable { navController.popBackStack() }
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