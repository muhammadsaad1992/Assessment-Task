package com.example.assessmenttask.mvvm

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.assessmenttask.model.CatFacts


import kotlinx.coroutines.launch

class FactsViewModel : ViewModel() {
    private val factRepository = FactRepository()

private val _facts = MutableLiveData<List<CatFacts>>()
    val facts: LiveData<List<CatFacts>>

    get() = _facts

    fun fetchFacts(){
        viewModelScope.launch {
            val response = factRepository.getFacts()
            Log.d("ABC1", "fetchFacts: $response")
            _facts.value = response
        }
    }
}