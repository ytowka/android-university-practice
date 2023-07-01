package com.danilkha.androidviews.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.danilkha.androidviews.BaseFragment
import com.danilkha.androidviews.app
import com.danilkha.androidviews.databinding.FragmentMainBinding
import com.danilkha.androidviews.viewModel

class MainFragment : BaseFragment<FragmentMainBinding>() {

    override fun createBinding(inflater: LayoutInflater) = FragmentMainBinding.inflate(inflater)

    val viewModel: MainViewModel by viewModel { MainViewModel(app.repository) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = findNavController()

        val carAdapter = CarListAdapter{
            val action = MainFragmentDirections.navigateInfo(it)
            navController.navigate(action)
        }

        binding.list.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = carAdapter
        }

        viewModel.carLiveData.observe(viewLifecycleOwner){
            carAdapter.list = it
        }
    }
}