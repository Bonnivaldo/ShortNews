package com.example.shortnews.data.entity

data class NewsResponse(
    val status: String,
    val totalResults: Int,
    val articlesList: List<Article>
)

data class Article(
    val source: Source,
    val author: String,
    val title: String,
    val description: String,
    val url: String,
    val urlToImage: String,
    val publishAt: String,
    val content: String,
)

data class Source(
    val id: String,
    val name: String
)