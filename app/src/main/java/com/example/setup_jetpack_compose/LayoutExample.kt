package com.example.setup_jetpack_compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
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
    ColumnDemo()
}

@Composable
fun ColumnDemo() {
    val radioOptions = listOf<String>("op 1", "op 2", "op 3")
    val selectedOption = remember { mutableStateOf(radioOptions[0]) }

    Column {
        LazyColumnDemo()
        radioOptions.forEach { option ->
            Row(
                Modifier.padding(vertical = 4.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                RadioButton(
                    selected = (option == selectedOption.value),
                    onClick = { selectedOption.value = option },
                    colors = RadioButtonDefaults.colors(selectedColor = Color.Red)
                )
                Text(
                    text = option,
                    modifier = Modifier.padding(start = 8.dp)
                )
            }
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

@Composable
fun ListPreview() {
    
}

@Composable
fun LazyColumnDemo() {
    LazyColumn (
        modifier = Modifier
            .size(height = 20.dp, width = 100.dp)
            .fillMaxSize()
    ){
        items(5){
            Text("Line $it")
        }
    }
}