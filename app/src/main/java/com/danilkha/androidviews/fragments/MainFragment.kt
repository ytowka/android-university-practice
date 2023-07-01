package com.danilkha.androidviews.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.navigation.fragment.findNavController
import com.danilkha.androidviews.BaseFragment
import com.danilkha.androidviews.databinding.FragmentMainBinding

class MainFragment : BaseFragment<FragmentMainBinding>() {

    override fun createBinding(inflater: LayoutInflater) = FragmentMainBinding.inflate(inflater)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = findNavController()

        binding.button.setOnClickListener {
            val action = MainFragmentDirections.navigateDepth(this::class.simpleName)
            navController.navigate(action)
        }
    }
}