package com.danilkha.androidviews.fragments

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.danilkha.androidviews.data.Car
import com.danilkha.androidviews.data.Repository

class MainViewModel(
    val repository: Repository
) : ViewModel(){


    private var _carsLiveDate = MutableLiveData<List<Car>>()
    val carLiveData
        get() = _carsLiveDate

    init {
        _carsLiveDate.value = repository.getAll()
    }
}