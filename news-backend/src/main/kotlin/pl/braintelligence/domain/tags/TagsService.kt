package pl.braintelligence.domain.tags

import org.springframework.stereotype.Service
import pl.braintelligence.domain.ports.incoming.TagsPort
import pl.braintelligence.infrastructure.adapters.incoming.api.tags.dto.NewTagDto

@Service
class TagsService: TagsPort {

    override fun createTags(newTagDto: NewTagDto): Nothing = TODO("not implemented")

    override fun changeTags(newTagDto: NewTagDto): Nothing = TODO("not implemented")

    override fun removeTags(newTagDto: NewTagDto): Nothing = TODO("not implemented")

}
