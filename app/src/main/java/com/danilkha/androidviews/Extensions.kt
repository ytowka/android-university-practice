package com.danilkha.androidviews

import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStoreOwner

inline fun<reified T : ViewModel> Fragment.viewModel(owner: ViewModelStoreOwner = this, crossinline factory: () -> T) = lazy {
    ViewModelProvider(this, object : ViewModelProvider.Factory{
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            return factory() as T
        }
    })[T::class.java]
}

val Fragment.app
    get() = requireActivity().application as App