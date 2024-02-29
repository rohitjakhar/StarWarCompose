package com.rohitjakhar.starwarcompose.data.remote

import com.rohitjakhar.starwarcompose.data.model.FilmsResponseDto
import com.rohitjakhar.starwarcompose.data.model.PeoplesResponseDto
import com.rohitjakhar.starwarcompose.data.model.PlanetsResponseDto
import com.rohitjakhar.starwarcompose.data.model.SpeciesResponseDto
import com.rohitjakhar.starwarcompose.data.model.StarShipResponseDto
import com.rohitjakhar.starwarcompose.data.model.VehiclesResponseDto
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface StarWarApiService {

    @GET("people/")
    suspend fun getAllPeople(): Response<PeoplesResponseDto>

    @GET("planets/")
    suspend fun getAllPlanet(): Response<PlanetsResponseDto>

    @GET("species/")
    suspend fun getAllSpecies(): Response<SpeciesResponseDto>

    @GET("starships/")
    suspend fun getAllStarShip(): Response<StarShipResponseDto>

    @GET("vehicles/")
    suspend fun getAllVehicle(): Response<VehiclesResponseDto>

    @GET("films/")
    suspend fun getAllFilms(): Response<FilmsResponseDto>



    companion object {
        private const val BASE_URL = "https://swapi.dev/api/"

        fun getClient() =
            Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(StarWarApiService::class.java)
    }
}