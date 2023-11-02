package com.example.setup_jetpack_compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview (showSystemUi = true)
@Composable
fun LayoutDemo() {
    BoxDemo()
}

@Composable
fun ColumnDemo() {
    Column {
        Text("Xin chào", fontSize = 20.sp)
        Text("Xin chào", fontSize = 20.sp)
        Text("Xin chào", fontSize = 20.sp)
        Text("Xin chào", fontSize = 20.sp)
        Row {
            Text("Xin chào", fontSize = 20.sp)
            Text("Xin chào", fontSize = 20.sp)
        }
    }
}

@Composable
fun BoxDemo() {
    Column{
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = null,
            modifier = Modifier.background(Color.Red)
        )
        Text(text = "abcxys", fontSize = 20.sp,
            modifier = Modifier.background(Color.Blue)
            )
        Text(text = "Xin chào", fontSize = 20.sp,
            modifier = Modifier.background(Color.Yellow)
            )
        Text(text = "test modifier",
            fontSize = 20.sp,
            modifier = Modifier
                .width(50.dp)
                .background(Color.Blue)
                .padding(6.dp)
                .border(
                    width = 2.dp,
                    color = Color.Red,
                    shape = MaterialTheme.shapes.medium
                )
        )
        Box(
            modifier = Modifier
                .padding(top = 10.dp)
                .size(100.dp)
                .background(Color.Green)
        ){
            Box(modifier = Modifier
                .size(50.dp)
                .background(Color.Red)
                .background(Color.Blue)

                )
        }

    }
}


class LayoutExample {
}