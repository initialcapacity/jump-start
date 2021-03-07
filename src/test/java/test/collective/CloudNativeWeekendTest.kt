package test.collective

import io.collective.CloudNativeWeekend
import org.junit.Assert.assertTrue
import org.junit.Test

class CloudNativeWeekendTest {
    @Test
    fun isEmpty() {
        assertTrue(CloudNativeWeekend().startingSoon())
    }
}