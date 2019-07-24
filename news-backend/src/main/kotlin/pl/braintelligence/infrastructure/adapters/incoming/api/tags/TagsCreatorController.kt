package pl.braintelligence.infrastructure.adapters.incoming.api.tags

import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import pl.braintelligence.domain.tags.TagsService
import pl.braintelligence.infrastructure.adapters.incoming.api.tags.dto.NewTagDto

@RestController("/tags")
class TagsCreatorController(
        private val tagsService: TagsService
) {

    @PostMapping
    fun createTags(@RequestBody newTagDto: NewTagDto): Nothing = tagsService.createTags()

    @DeleteMapping("change")
    fun changeTags(@RequestBody newTagDto: NewTagDto): Nothing = tagsService.changeTags()

    @DeleteMapping("remove")
    fun removeTags(@RequestBody newTagDto: NewTagDto): Nothing = tagsService.removeTags()

}
