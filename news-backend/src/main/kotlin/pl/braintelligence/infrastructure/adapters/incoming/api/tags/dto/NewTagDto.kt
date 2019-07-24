package pl.braintelligence.infrastructure.adapters.incoming.api.tags.dto

data class NewTagDto(
        val rootTag: String,
        val subTag: List<String>
)
