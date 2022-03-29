package io.initialcapacity.weekend

import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.node.NullNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.web.server.LocalServerPort
import org.springframework.http.HttpStatus

@SpringBootTest(webEnvironment = RANDOM_PORT)
class DependenciesTest {
    @LocalServerPort
    lateinit var port: String

    @Test
    fun testHealth() {
        val healthResponse = TestRestTemplate().getForEntity("http://localhost:$port/actuator/health", JsonNode::class.java)
        val responseBody = healthResponse.body ?: NullNode.instance

        assertServiceUp(responseBody, "db", "PostgreSQL")
        assertServiceUp(responseBody, "rabbit", "RabbitMQ")

        assertEquals(HttpStatus.OK, healthResponse.statusCode, "Check that all of your services are running")
    }
}

private fun assertServiceUp(json: JsonNode, key: String, name: String) =
    assertEquals("UP", json.get("components")?.get(key)?.get("status")?.asText(), "There is a problem with $name")
