package com.rohitjakhar.starwarcompose.data.remote

import kotlinx.coroutines.test.runTest
import org.junit.Before
import org.junit.Test

class AppRepoTest {
    private lateinit var starWarApiService: StarWarApiService

    @Before
    fun setup() {
        starWarApiService = StarWarApiService.getClient()
    }

    @Test
    fun `test get planets Api`() = runTest {
        val resp = starWarApiService.getAllPeople()
        assert(resp.code() == 200)
        assert(resp.isSuccessful)
    }

    @Test
    fun `test get species Api`() = runTest {
        val resp = starWarApiService.getAllSpecies()
        assert(resp.code() == 200)
        assert(resp.isSuccessful)
    }

    @Test
    fun `test get starship Api`() = runTest {
        val resp = starWarApiService.getAllStarShip()
        assert(resp.code() == 200)
        assert(resp.isSuccessful)
    }

    @Test
    fun `test get vehicles Api`() = runTest {
        val resp = starWarApiService.getAllVehicle()
        assert(resp.code() == 200)
        assert(resp.isSuccessful)

    }

    @Test
    fun `test get films Api`() = runTest {
        val resp = starWarApiService.getAllFilms()
        assert(resp.code() == 200)
        assert(resp.isSuccessful)
    }

    @Test
    fun `test getPeople Api`() = runTest {
        val resp = starWarApiService.getAllPeople()
        assert(resp.code() == 200)
        assert(resp.isSuccessful)
    }
}