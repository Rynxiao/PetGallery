package com.tutorials.mypets.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.google.accompanist.pager.ExperimentalPagerApi
import com.tutorials.mypets.R
import com.tutorials.mypets.components.Pager
import com.tutorials.mypets.data.banner
import com.tutorials.mypets.model.ImageRes
import com.tutorials.mypets.navigation.PetScreens
import com.tutorials.mypets.ui.theme.fonts

@ExperimentalPagerApi
@Preview
@Composable
fun SplashScreen(navController: NavController = NavController(LocalContext.current)) {
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Pager(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .scale(scaleX = 0.65f, scaleY = 1.0f),
            list = banner
        ) { banner ->
            Image(
                modifier = Modifier.fillMaxSize(),
                painter = painterResource(id = (banner as ImageRes).imageRes),
                contentDescription = "img husky",
                contentScale = ContentScale.FillBounds
            )
        }
        Spacer(modifier = Modifier.padding(top = 16.dp, bottom = 20.dp))
        Text(
            text = stringResource(id = R.string.banner_title),
            fontSize = 20.sp,
            fontFamily = fonts,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
        Text(
            modifier = Modifier.padding(top = 15.dp),
            text = stringResource(id = R.string.sub_title),
            fontSize = 14.sp,
            fontFamily = fonts,
            color = Color.DarkGray,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(50.dp))
        RoundedButton(text = "Skip") {
            navController.navigate(PetScreens.HomeScreen.name)
        }
    }
}

@Composable
fun RoundedButton(text: String, onClick: () -> Unit) {
    Button(
        onClick = onClick,
        Modifier.size(60.dp),
        shape = CircleShape,
        colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.primary)
    ) {
        Text(
            text = text,
            fontSize = 12.sp,
            fontFamily = fonts,
            color = Color.White
        )
    }
}
