package com.rohitjakhar.starwarcompose.data.remote

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertEquals
import org.junit.Test
import org.mockito.kotlin.eq

class StarWarApiServiceFactoryTest {
    @Test
    fun `getClient should return the same instance when invoked multiple times`() {

        runBlocking {
            val client1 = StarWarApiService.getClient()
            val client2 = StarWarApiService.getClient()

            assert(client1 === client2) {
                "Not same instance"
            }
        }
    }

    @Test
    fun `getClient should return same instance when called concurrently`() {
        runBlocking {
            // Creating multiple coroutines to call getClient concurrently
            val job1 = launch { getClientAndAssert() }
            val job2 = launch { getClientAndAssert() }

            // Waiting for coroutines to finish
            job1.join()
            job2.join()
        }
    }

    private fun getClientAndAssert() {
        val instance1 = StarWarApiService.getClient()
        val instance2 = StarWarApiService.getClient()

        // Asserting that both instances are the same
        //assertEquals(eq(instance1), eq(instance2))
        assert(instance1 === instance2) {
            "Not same instance in different thread"
        }
    }
}