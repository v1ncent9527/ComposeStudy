package com.vincent.composedemo.modifier

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.vincent.composedemo.R

@Composable
fun ModifierSize(size: Dp) {
    Row {
        Image(
            painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = null,
            modifier = Modifier
                .size(size)
                .clip(CircleShape)
        )

        Spacer(
            modifier = Modifier
                .size(8.dp)
        )
        Image(
            painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = null,
            modifier = Modifier
                .size(size * 2)
                .clip(CircleShape)
        )
    }
}

@Composable
fun ModifierBackground() {
    Row {
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(color = Color.Green)
        ) {
            Text(text = "纯色", modifier = Modifier.align(Alignment.Center))
        }

        Spacer(modifier = Modifier.size(10.dp))

        Box(
            modifier = Modifier
                .size(100.dp)
                .background(
                    brush = Brush.horizontalGradient(
                        colors = listOf(
                            Color.Red,
                            Color.Green,
                            Color.Blue
                        )
                    )
                )
        ) {
            Text(text = "horizontal渐变色", modifier = Modifier.align(Alignment.Center))
        }

        Spacer(modifier = Modifier.size(10.dp))

        Box(
            modifier = Modifier
                .size(100.dp)
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Color.Red,
                            Color.Green,
                            Color.Blue
                        )
                    )
                )
        ) {
            Text(text = "vertical渐变色", modifier = Modifier.align(Alignment.Center))
        }
    }
}

@Composable
fun ModifierFillMaxSize() {
//    Box(modifier = Modifier.fillMaxSize().background(color = Color.Green))
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .background(color = Color.Green)
    )
//    Box(modifier = Modifier.fillMaxHeight().width(100.dp).background(color = Color.Green))
}

@Composable
fun ModifierBorderAndPadding() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .padding(10.dp)
            .border(width = 10.dp, color = Color.Green, shape = RoundedCornerShape(10.dp))
            .padding(20.dp)
    ) {
        Spacer(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Red)
        )
    }
}

@Composable
fun ModifierOffSet() {
    Box(
        modifier = Modifier
            .size(200.dp)
            .offset(x = 100.dp, y = 100.dp)
            .background(Color.Red)
    )
}