package com.example.setup_jetpack_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.setup_jetpack_compose.ui.theme.Setup_jetpack_composeTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var listProducts: List<Product> = mutableListOf(
            Product(name = "Sy", description = "hello", price = 3.4),
            Product(name = "Minh", description = "hello", price = 3.4),
            Product(name = "Ngoc", description = "hello", price = 3.4),
        )
        setContent {
            Setup_jetpack_composeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    DemoLazyColumn(listProducts)
                }
            }
        }
    }
}

@Composable
fun DemoLazyColumn(listProducts: List<Product>) {
    LazyColumn(
        modifier = Modifier.height(100.dp),
    ){
        items(listProducts) {
            item -> ListItem(item)
        }
    }
}

@Composable
fun ListItem(item: Product) {
    Row (modifier = Modifier.fillMaxWidth()){
        Text(text = item.name)
        Text(text = "Price:${item.price}$")
    }
    Text(text = item.description)
}

@Composable
fun ColumnDemo() {
    Column {
        TextHello()
        Spacer(modifier = Modifier.height(12.dp))
        TextButton()
        ImageDemo()
    }
}

@Composable
fun TextHello() {
    Text(
        text = stringResource(id = R.string.test_text),
        color = Color.Red ,
        fontSize = 30.sp,
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight(500),
        textAlign = TextAlign.Start,
        fontFamily = FontFamily.Cursive,
        textDecoration = TextDecoration.LineThrough,
        maxLines = 2,
        overflow = TextOverflow.Ellipsis
        )
}

@Composable
fun TextButton() {
    Button(
        onClick = { /*TODO*/ },
        modifier = Modifier.padding(6.dp),
        elevation = ButtonDefaults.buttonElevation(10.dp)
        ) {
        Text(text = "Hello")
    }
}

@Composable
fun ImageDemo() {
    Image(painter = painterResource(id = R.drawable.image1),
        alpha = 0.5f,
        contentDescription = "xin chao",
        contentScale = ContentScale.FillWidth,
    )
}