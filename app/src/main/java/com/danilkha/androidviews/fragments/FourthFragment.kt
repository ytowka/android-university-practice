package com.danilkha.androidviews.fragments

import android.view.LayoutInflater
import com.danilkha.androidviews.BaseFragment
import com.danilkha.androidviews.databinding.FragmentFourBinding
import com.danilkha.androidviews.databinding.FragmentMainBinding

class FourthFragment : BaseFragment<FragmentFourBinding>() {

    override fun createBinding(inflater: LayoutInflater) = FragmentFourBinding.inflate(inflater)
}