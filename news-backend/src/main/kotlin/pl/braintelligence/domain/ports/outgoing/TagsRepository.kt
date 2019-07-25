package pl.braintelligence.domain.ports.outgoing

import pl.braintelligence.infrastructure.adapters.incoming.api.tags.dto.NewTagDto

interface TagsRepository {

    fun save(newTagDto: NewTagDto)

}
