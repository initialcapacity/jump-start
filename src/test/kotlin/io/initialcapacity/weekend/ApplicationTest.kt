package io.initialcapacity.weekend

import com.fasterxml.jackson.databind.JsonNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT
import org.springframework.boot.web.server.LocalServerPort
import org.springframework.http.HttpStatus
import org.springframework.web.client.RestTemplate

@SpringBootTest(webEnvironment = RANDOM_PORT)
class ApplicationTest {
    @LocalServerPort
    lateinit var port: String

    @Test
    fun testHealth() {
        val response = RestTemplate().getForEntity("http://localhost:$port/actuator/health", JsonNode::class.java)

        assertEquals(
            "UP",
            response.body?.get("components")?.get("db")?.get("status")?.asText(),
            "There is a problem with PostgreSQL"
        )

        assertEquals(HttpStatus.OK, response.statusCode)
    }
}
