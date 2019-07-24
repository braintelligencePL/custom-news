package pl.braintelligence.infrastructure.adapters.incoming.api.news

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import pl.braintelligence.domain.news.NewsCreatorService
import pl.braintelligence.infrastructure.adapters.incoming.api.news.dto.NewNewsDto

@RestController("news")
class PrepareNewsController(
        private val newsCreatorService: NewsCreatorService
) {

    @PostMapping
    fun prepareNews(@RequestBody newNewsDto: NewNewsDto) = newsCreatorService.prepareNews(newNewsDto)

}
