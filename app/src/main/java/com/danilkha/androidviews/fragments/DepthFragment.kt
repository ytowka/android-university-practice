package com.danilkha.androidviews.fragments

import android.view.LayoutInflater
import androidx.core.os.bundleOf
import com.danilkha.androidviews.BaseFragment
import com.danilkha.androidviews.databinding.FragmentDepthBinding
import com.danilkha.androidviews.databinding.FragmentFiveBinding
import com.danilkha.androidviews.databinding.FragmentMainBinding
import com.google.android.material.snackbar.Snackbar

class DepthFragment : BaseFragment<FragmentDepthBinding>() {

    override fun createBinding(inflater: LayoutInflater) = FragmentDepthBinding.inflate(inflater)

    val args: DepthFragmentArgs by lazy { DepthFragmentArgs.fromBundle (arguments ?: bundleOf()) }

    override fun onStart() {
        super.onStart()
        Snackbar.make(binding.root, args.name ?: "", Snackbar.LENGTH_LONG).show()
    }
}