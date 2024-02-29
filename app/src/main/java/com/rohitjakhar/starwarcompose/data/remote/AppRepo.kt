package com.rohitjakhar.starwarcompose.data.remote

import com.rohitjakhar.starwarcompose.data.model.FilmsResponseDto
import com.rohitjakhar.starwarcompose.data.model.PeoplesResponseDto
import com.rohitjakhar.starwarcompose.data.model.PlanetsResponseDto
import com.rohitjakhar.starwarcompose.data.model.SpeciesResponseDto
import com.rohitjakhar.starwarcompose.data.model.StarShipResponseDto
import com.rohitjakhar.starwarcompose.data.model.VehiclesResponseDto
import com.rohitjakhar.starwarcompose.utils.Response


class AppRepo @JvmOverloads constructor(
    private val service: StarWarApiService = StarWarApiService.getClient()
) {
    suspend fun getPeoples(): Response<PeoplesResponseDto> {
        val resp = service.getAllPeople()
        if (resp.isSuccessful && resp.body() != null) {
            return Response.Success(data = resp.body()!!)
        }
        return Response.Error(resp.message())
    }

    suspend fun getPlanets(): Response<PlanetsResponseDto> {
        val resp = service.getAllPlanet()
        if (resp.isSuccessful && resp.body() != null) {
            return Response.Success(data = resp.body()!!)
        }
        return Response.Error(resp.message())
    }

    suspend fun getSpecies(): Response<SpeciesResponseDto> {
        val resp = service.getAllSpecies()
        if (resp.isSuccessful && resp.body() != null) {
            return Response.Success(data = resp.body()!!)
        }
        return Response.Error(resp.message())
    }

    suspend fun getStartShips(): Response<StarShipResponseDto> {
        val resp = service.getAllStarShip()
        if (resp.isSuccessful && resp.body() != null) {
            return Response.Success(data = resp.body()!!)
        }
        return Response.Error(resp.message())
    }

    suspend fun getVehicles(): Response<VehiclesResponseDto> {
        val resp = service.getAllVehicle()
        if (resp.isSuccessful && resp.body() != null) {
            return Response.Success(data = resp.body()!!)
        }
        return Response.Error(resp.message())
    }

    suspend fun getFilms(): Response<FilmsResponseDto> {
        val resp = service.getAllFilms()
        if (resp.isSuccessful && resp.body() != null) {
            return Response.Success(data = resp.body()!!)
        }
        return Response.Error(resp.message())
    }
}