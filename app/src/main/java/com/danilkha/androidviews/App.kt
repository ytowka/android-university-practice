package com.danilkha.androidviews

import android.app.Application
import com.danilkha.androidviews.data.Repository

class App : Application() {

    val repository by lazy { Repository.FakeImpl() }
}