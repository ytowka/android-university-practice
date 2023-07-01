package com.danilkha.androidviews.fragments

import android.view.LayoutInflater
import com.danilkha.androidviews.BaseFragment
import com.danilkha.androidviews.databinding.FragmentFiveBinding
import com.danilkha.androidviews.databinding.FragmentMainBinding

class FifthFragment : BaseFragment<FragmentFiveBinding>() {

    override fun createBinding(inflater: LayoutInflater) = FragmentFiveBinding.inflate(inflater)
}