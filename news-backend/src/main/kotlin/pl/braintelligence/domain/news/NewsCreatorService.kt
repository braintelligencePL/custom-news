package pl.braintelligence.domain.news

import org.springframework.stereotype.Service
import pl.braintelligence.infrastructure.adapters.incoming.api.news.dto.NewNewsDto

@Service
class NewsCreatorService {

    fun prepareNews(newNews: NewNewsDto) =
            run {
                News.toNews(newNews)
            }.also {
                TODO()
            }

}
