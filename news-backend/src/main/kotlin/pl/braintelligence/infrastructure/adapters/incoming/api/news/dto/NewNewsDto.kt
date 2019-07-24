package pl.braintelligence.infrastructure.adapters.incoming.api.news.dto

data class NewNewsDto(
        val title: String,
        val url: String,
        val sourceType: String,
        val description: String,
        val category: CategoryDto
)

data class CategoryDto(
        val rootTag: String,
        val subTag: String
)
