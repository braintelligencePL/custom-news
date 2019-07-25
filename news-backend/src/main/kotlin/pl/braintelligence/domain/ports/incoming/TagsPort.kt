package pl.braintelligence.domain.ports.incoming

import pl.braintelligence.infrastructure.adapters.incoming.api.tags.dto.NewTagDto

interface TagsPort {

    fun createTags(newTagDto: NewTagDto)

    fun changeTags(newTagDto: NewTagDto)

    fun removeTags(newTagDto: NewTagDto)

}
