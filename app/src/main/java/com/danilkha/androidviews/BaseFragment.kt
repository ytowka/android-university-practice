package com.danilkha.androidviews

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

abstract class BaseFragment <B : ViewBinding>: Fragment(){

    private lateinit var _binding: B
    val binding get() = _binding

    abstract fun createBinding(inflater: LayoutInflater): B

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = createBinding(inflater)
        return binding.root
    }
}