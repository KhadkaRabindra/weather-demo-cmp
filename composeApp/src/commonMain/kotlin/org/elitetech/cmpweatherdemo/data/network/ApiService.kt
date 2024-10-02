package org.elitetech.cmpweatherdemo.data.network

import dev.icerock.moko.geo.LatLng
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.get
import io.ktor.client.request.parameter
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json
import org.elitetech.cmpweatherdemo.data.models.ForecastResponse
import org.elitetech.cmpweatherdemo.data.models.WeatherResponse

class ApiService {
    private val baseURL = "https://api.openweathermap.org/data/2.5/weather?"
    private val httpClient = HttpClient{
        install(ContentNegotiation){
            json(Json {
                encodeDefaults = true
                isLenient = true
                coerceInputValues = true
                ignoreUnknownKeys = true
            })
        }
    }


    suspend fun getWeather(location: LatLng): WeatherResponse {
        return httpClient.get("https://api.openweathermap.org/data/2.5/weather?") {
            parameter("appid", apiKey)
            parameter("units", "metric")
            parameter("lon", location.longitude)
            parameter("lat", location.latitude)
        }.body()
    }

    suspend fun getForecast(location: LatLng): ForecastResponse {
        return httpClient.get("https://api.openweathermap.org/data/2.5/forecast?") {
            parameter("appid", apiKey)
            parameter("units", "metric")
            parameter("lon", location.longitude)
            parameter("lat", location.latitude)
        }.body()
    }
}