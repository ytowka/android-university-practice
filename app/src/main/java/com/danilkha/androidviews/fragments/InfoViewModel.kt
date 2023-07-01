package com.danilkha.androidviews.fragments

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.danilkha.androidviews.data.Car
import com.danilkha.androidviews.data.Repository

class InfoViewModel(
    val repository: Repository,
    val id: Long,
) : ViewModel(){

    private var _carInfoLiveDate = MutableLiveData<Car>()
    val carLiveData
        get() = _carInfoLiveDate

    init {
        val car = repository.getById(id)
        car?.let { _carInfoLiveDate.value = it }
    }
}