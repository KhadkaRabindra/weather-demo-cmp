package org.elitetech.cmpweatherdemo.data.repository

import dev.icerock.moko.geo.LatLng
import org.elitetech.cmpweatherdemo.data.network.ApiService

class WeatherRepository {

    private val apiService = ApiService()

    suspend fun fetchWeather(location: LatLng) = apiService.getWeather(location)
    suspend fun fetchForecast(location: LatLng) = apiService.getForecast(location)

}