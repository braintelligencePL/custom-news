package pl.braintelligence.domain.news

import arrow.core.Try
import arrow.core.getOrElse
import pl.braintelligence.domain.news.values.Category
import pl.braintelligence.domain.news.values.PublishStatus
import pl.braintelligence.domain.news.values.SourceType
import pl.braintelligence.infrastructure.adapters.incoming.api.news.dto.NewNewsDto


data class News(
        val title: String,
        val url: String,
        val sourceType: SourceType,
        val description: String,
        val category: Category,
        val publishStatus: PublishStatus = PublishStatus.NOT_PUBLISHED
) {
    companion object {
        fun toNews(newNewsDto: NewNewsDto): News =
                News(
                        title = newNewsDto.title,
                        url = newNewsDto.url,
                        sourceType = validateSourceType(newNewsDto.sourceType),
                        description = newNewsDto.description,
                        category = newNewsDto.category.let { Category(it.rootTag, it.subTag) }
                )

        private fun validateSourceType(sourceType: String): SourceType = Try {
            SourceType.valueOf(sourceType)
        }.getOrElse { SourceType.INVALID }
    }
}
