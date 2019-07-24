package pl.braintelligence.infrastructure.adapters.incoming.api.tags

import org.springframework.web.bind.annotation.*
import pl.braintelligence.domain.tags.TagsService

@RestController("tags")
class TagsController(
        private val tagsService: TagsService
) {

    @PostMapping("{rootTag}")
    fun createRootTag(@PathVariable rootTag: String): Nothing = TODO()

    @PostMapping("{rootTag}/{subTag}")
    fun createSubTag(@PathVariable rootTag: String): Nothing = TODO()

    @PutMapping("{rootTag}")
    fun renameRootTag(@PathVariable rootTag: String): Nothing = TODO()

    @PutMapping("{rootTag}/{subTag}")
    fun renameSubTag(@PathVariable rootTag: String): Nothing = TODO()

    @DeleteMapping("{rootTag}")
    fun removeRootTag(@PathVariable rootTag: String): Nothing = TODO()

    @DeleteMapping("{rootTag}/{subTag}")
    fun removeSubTagFromRootTag(@PathVariable rootTag: String): Nothing = TODO()

}
