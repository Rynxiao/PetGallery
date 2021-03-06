package com.tutorials.mypets.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.google.accompanist.pager.*
import com.tutorials.mypets.model.ImageRes
import com.tutorials.mypets.utils.lerp
import kotlinx.coroutines.delay
import kotlin.math.absoluteValue

@ExperimentalPagerApi
@Composable
fun <T> Pager(
    modifier: Modifier = Modifier,
    list: List<T>,
    imageRadius: Dp = 10.dp,
    content: @Composable (item: T) -> Unit
) {
    val pagerState = rememberPagerState()
    LaunchedEffect(key1 = pagerState.currentPage) {
        delay(2000L)
        val toPage = if (pagerState.currentPage == pagerState.pageCount - 1) 0
                    else pagerState.currentPage + 1
        pagerState.scrollToPage(toPage)
    }

    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Box(modifier = modifier) {
            HorizontalPager(
                count = list.size,
                state = pagerState,
                modifier = Modifier.fillMaxSize()
            ) { page ->
                Card(
                    modifier = Modifier
                        .graphicsLayer {
                            // Calculate the absolute offset for the current page from the
                            // scroll position. We use the absolute value which allows us to mirror
                            // any effects for both directions
                            val pageOffset = calculateCurrentOffsetForPage(page).absoluteValue

                            // We animate the scaleX + scaleY, between 85% and 100%
                            lerp(
                                start = 0.85f,
                                stop = 1f,
                                fraction = 1f - pageOffset.coerceIn(0f, 1f)
                            ).also { scale ->
                                scaleX = scale
                                scaleY = scale
                            }

                            // We animate the alpha, between 50% and 100%
                            alpha = lerp(
                                start = 0.5f,
                                stop = 1f,
                                fraction = 1f - pageOffset.coerceIn(0f, 1f)
                            )
                        }
                        .fillMaxWidth(),
                    elevation = 0.dp,
                    shape = RoundedCornerShape(imageRadius)
                ) {
                    content(list[page])
                }
            }
        }
        Spacer(modifier = Modifier.height(20.dp))
        Indicators(size = list.size, index = pagerState.currentPage)
    }
}