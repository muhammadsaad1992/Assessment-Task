package com.example.assessmenttask.mvvm

import com.example.assessmenttask.api.RetrofitClient
import com.example.assessmenttask.model.CatFacts

class FactRepository {
    suspend fun getFacts(): List<CatFacts>{
        return RetrofitClient.apiService.getFacts()
    }
}