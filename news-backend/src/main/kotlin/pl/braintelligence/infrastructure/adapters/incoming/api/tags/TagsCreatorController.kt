package pl.braintelligence.infrastructure.adapters.incoming.api.tags

import org.springframework.web.bind.annotation.*
import pl.braintelligence.domain.ports.incoming.TagsPort
import pl.braintelligence.infrastructure.adapters.incoming.api.tags.dto.NewTagDto

@RestController("/tags")
class TagsCreatorController(
        private val tagsPort: TagsPort
) {

    @PostMapping
    fun createTags(@RequestBody newTagDto: NewTagDto): Unit = tagsPort.createTags(newTagDto)

    @PutMapping
    fun changeTags(@RequestBody newTagDto: NewTagDto): Unit = tagsPort.changeTags(newTagDto)

    @DeleteMapping
    fun removeTags(@RequestBody newTagDto: NewTagDto): Unit = tagsPort.removeTags(newTagDto)

}
