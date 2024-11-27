package com.example.cloudy_app.api

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {


    @GET("/v1/current.json")

    suspend fun getWeatherData(@Query("key") apiKey:String,@Query("q") city:String):Response<WeatherModel>
}