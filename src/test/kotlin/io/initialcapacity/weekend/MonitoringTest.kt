package io.initialcapacity.weekend

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.HttpStatus
import org.springframework.web.client.RestClientException

class MonitoringTest {
    @Test
    fun testPrometheus() {
        try {
            val prometheusResponse = TestRestTemplate().getForEntity("http://localhost:9090/graph", String::class.java)
            Assertions.assertEquals(
                HttpStatus.OK,
                prometheusResponse.statusCode,
                "Check that Prometheus is installed and running"
            )
        } catch (e: RestClientException) {
            Assertions.fail("Check that Prometheus is installed and running", e)
        }
    }

    @Test
    fun testGrafana() {
        try {
            val prometheusResponse = TestRestTemplate().getForEntity("http://localhost:3000", String::class.java)
            Assertions.assertEquals(
                HttpStatus.OK,
                prometheusResponse.statusCode,
                "Check that Grafana is installed and running"
            )
        } catch (e: RestClientException) {
            Assertions.fail("Check that Grafana is installed and running", e)
        }
    }
}
