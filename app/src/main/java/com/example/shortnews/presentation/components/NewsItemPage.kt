package com.example.shortnews.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.shortnews.R
import com.example.shortnews.data.entity.Article
import com.example.shortnews.shared.mockArticle

@Composable
fun NewsItemPage(article: Article) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
            .background(Color.White)
    ) {
        AsyncImage(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(),
            model = article.urlToImage,
            contentDescription = article.description,
            contentScale = ContentScale.FillWidth,
            placeholder = painterResource(id = R.drawable.ic_placeholder),
            error = painterResource(id = R.drawable.ic_placeholder),
        )
        Spacer(modifier = Modifier.size(8.dp))
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            text = article.title ?: "",
            style = TextStyle(
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            ),
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.Top
        ) {
            Text(
                modifier = Modifier
                    .padding(16.dp),
                style = TextStyle(
                    fontSize = 8.sp,
                    fontWeight = FontWeight.Light,
                    color = Color.Gray
                ),
                textAlign = TextAlign.Justify,
                text = article.author ?: "",
            )
            Text(
                modifier = Modifier
                    .padding(16.dp),
                style = TextStyle(
                    fontSize = 8.sp,
                    fontWeight = FontWeight.Light,
                    color = Color.Gray
                ),
                textAlign = TextAlign.Justify,
                text = article.publishAt ?: "",
            )
        }
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.Light,
                color = Color.DarkGray
            ),
            textAlign = TextAlign.Justify,
            text = article.content ?: "",
        )
        Spacer(modifier = Modifier.weight(1f))
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp)
                .clickable { },
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.Normal,
                color = Color.DarkGray
            ),
            textAlign = TextAlign.Justify,
            text = "Saiba mais em: ${article.source.name}"
        )
    }
}

@Preview
@Composable
fun NewsItemPagePreview() {
    NewsItemPage(mockArticle())
}

