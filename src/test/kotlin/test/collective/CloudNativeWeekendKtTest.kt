package test.collective

import io.collective.CloudNativeWeekendKt
import org.junit.Assert.assertTrue
import org.junit.Test

class CloudNativeWeekendKtTest {
    @Test
    fun startingSoon() {
        assertTrue(CloudNativeWeekendKt().startingSoon())
    }
}