package com.danilkha.androidviews.fragments

import android.view.LayoutInflater
import com.danilkha.androidviews.BaseFragment
import com.danilkha.androidviews.databinding.FragmentMainBinding
import com.danilkha.androidviews.databinding.FragmentThreeBinding

class ThirdFragment : BaseFragment<FragmentThreeBinding>() {

    override fun createBinding(inflater: LayoutInflater) = FragmentThreeBinding.inflate(inflater)
}