package pl.braintelligence.infrastructure.news.dto

data class NewWeeklyNews(
        val title: String,
        val url: String,
        val sourceType: String,
        val description: String,
        val category: Category
)

data class Category(
        val rootTag: String,
        val subTag: String
)
