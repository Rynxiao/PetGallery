package com.tutorials.mypets.screens.detail

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
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
import com.tutorials.mypets.R
import com.tutorials.mypets.components.DetailTopBar
import com.tutorials.mypets.components.Pager
import com.tutorials.mypets.data.pets
import com.tutorials.mypets.model.ImageRes
import com.tutorials.mypets.model.Sex
import com.tutorials.mypets.model.Species
import com.tutorials.mypets.ui.theme.fonts

@ExperimentalPagerApi
@Preview
@Composable
fun DetailScreen(
    navController: NavController = NavController(LocalContext.current),
    species: String? = Species.Akita.name
) {
    Scaffold(
        topBar = {
            DetailTopBar(
                navController = navController,
                species = species
            )
        }
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
                    val girlOrBody = if (sample.sex == Sex.Female) "girl" else "boy"
                    val years =
                        LocalContext.current.resources.getQuantityString(R.plurals.age, sample.age)
                    val notes = "${sample.brief} I'm a $girlOrBody and ${sample.age} $years old now!!!"

                    Image(
                        modifier = Modifier.fillMaxSize(),
                        painter = painterResource(id = (sample as ImageRes).imageRes),
                        contentDescription = "img husky",
                        contentScale = ContentScale.FillBounds
                    )
                    Box(
                        modifier = Modifier
                            .offset(0.dp, 190.dp)
                            .fillMaxWidth()
                            .background(color = Color.Black.copy(alpha = 0.3f))
                    ) {
                        Column(
                            modifier = Modifier.padding(10.dp).fillMaxWidth(),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.Start
                        ) {
                            Text(
                                text = sample.name,
                                color = Color.White,
                                fontFamily = fonts,
                                fontSize = 18.sp,
                            )
                            Text(
                                text = notes,
                                color = Color.White,
                                fontFamily = fonts,
                                fontSize = 14.sp,
                                overflow = TextOverflow.Ellipsis
                            )
                        }
                    }

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

