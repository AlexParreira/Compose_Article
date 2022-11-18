package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background
                ) {
                    ComposeArticleApp()

                }
            }
        }
    }
}

@Composable
fun ComposeArticleApp(){
    ComposeArticleCard(
        title = stringResource(R.string.Title_Text),
        column1 = stringResource(R.string.Column_One_Text),
        column2 = stringResource(R.string.Column_Two_Text),
        imagePainter = painterResource(R.drawable.bg_compose_background)
    )
}

@Composable
private fun ComposeArticleCard(title: String, column1: String, column2: String, imagePainter: Painter) {
    Column (modifier = Modifier) {
        Image(painter = imagePainter, contentDescription = null)

        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(16.dp)
        )
        Text(
            text = column1,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp)
        )
        Text(
            text = column2,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp)

        )

    }
}

@Preview(showBackground = false)
@Composable
fun ComposeArticlePreview() {
    ComposeArticleTheme {
        Surface {
            ComposeArticleApp()
        }
    }
}