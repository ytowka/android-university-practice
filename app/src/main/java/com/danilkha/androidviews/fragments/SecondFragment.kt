package com.danilkha.androidviews.fragments

import android.view.LayoutInflater
import com.danilkha.androidviews.BaseFragment
import com.danilkha.androidviews.databinding.FragmentMainBinding
import com.danilkha.androidviews.databinding.FragmentTwoBinding

class SecondFragment : BaseFragment<FragmentTwoBinding>() {

    override fun createBinding(inflater: LayoutInflater) = FragmentTwoBinding.inflate(inflater)
}