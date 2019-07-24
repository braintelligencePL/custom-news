package pl.braintelligence.domain.tags

import spock.lang.*

class TagsServiceTest extends Specification {
    TagsService tagsService = new TagsService()

    def "test create Tags"() {
        when:
        Void result = tagsService.createTags()

        then:
        result == null
    }

    def "test change Tags"() {
        when:
        Void result = tagsService.changeTags()

        then:
        result == null
    }

    def "test remove Tags"() {
        when:
        Void result = tagsService.removeTags()

        then:
        result == null
    }
}
