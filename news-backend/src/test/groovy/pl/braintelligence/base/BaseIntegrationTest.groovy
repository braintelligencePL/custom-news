package pl.braintelligence.base

import com.github.tomakehurst.wiremock.junit.WireMockRule
import org.junit.Rule
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.data.mongodb.core.MongoTemplate
import spock.lang.Specification

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class BaseIntegrationTest extends Specification implements BaseHttpMethods {

    @Rule
    public WireMockRule reportingService = new WireMockRule(8081)

    @Autowired
    private TestRestTemplate restTemplate

    @Autowired
    private MongoTemplate mongoTemplate

    void setup() {
        clearMongoDB()
    }

    private void clearMongoDB() {
        for (def collection : mongoTemplate.collectionNames) {
            mongoTemplate.dropCollection(collection)
        }
    }
}
