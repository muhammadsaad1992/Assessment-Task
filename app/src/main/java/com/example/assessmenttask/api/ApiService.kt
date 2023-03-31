package com.example.assessmenttask.api


import com.example.assessmenttask.model.CatFacts

import retrofit2.http.GET

interface ApiService {
    @GET("facts")
    suspend fun  getFacts() : List<CatFacts>
}