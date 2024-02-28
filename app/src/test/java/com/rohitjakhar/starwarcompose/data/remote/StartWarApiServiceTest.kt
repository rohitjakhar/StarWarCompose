package com.rohitjakhar.starwarcompose.data.remote

import kotlinx.coroutines.test.runTest
import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Test
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class StartWarApiServiceTest {
    private lateinit var apiService: StarWarApiService

    @Before
    fun setup() {
        apiService = Retrofit.Builder()
            .baseUrl("https://swapi.dev/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(StarWarApiService::class.java)
    }

    @Test
    fun `test api for all people`() = runTest {
        val response = apiService.getAllPeople()
        assertNotNull(response)
        assertEquals(200, response.code())
    }

    @Test
    fun `test api for all films`() = runTest {
        val response = apiService.getAllFilms()
        assertNotNull(response)
        assertEquals(200, response.code())
    }

    @Test
    fun `test api for all planet`() = runTest {
        val response = apiService.getAllPlanet()
        assertNotNull(response)
        assertEquals(200, response.code())
    }

    @Test
    fun `test api for all Species`() = runTest {
        val response = apiService.getAllSpecies()
        assertNotNull(response)
        assertEquals(200, response.code())
    }

    @Test
    fun `test api for all Vehicle`() = runTest {
        val response = apiService.getAllVehicle()
        assertNotNull(response)
        assertEquals(200, response.code())
    }

    @Test
    fun `test api for all StartShip`() = runTest {
        val response = apiService.getAllStartShip()
        assertNotNull(response)
        assertEquals(200, response.code())
    }
}