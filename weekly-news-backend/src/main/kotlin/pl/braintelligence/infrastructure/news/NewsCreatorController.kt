package pl.braintelligence.infrastructure.news

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import pl.braintelligence.domain.NewsCreatorService
import pl.braintelligence.infrastructure.news.dto.NewWeeklyNews

@RestController("news")
class NewsCreatorController(
        private val newsCreatorService: NewsCreatorService
) {

    @PostMapping
    fun prepareWeeklyNews(@RequestBody newWeeklyNews: NewWeeklyNews) =
            newsCreatorService.prepareWeeklyNews(newWeeklyNews)

}

