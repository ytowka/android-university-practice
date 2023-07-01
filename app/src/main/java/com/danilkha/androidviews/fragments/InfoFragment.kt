package com.danilkha.androidviews.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.danilkha.androidviews.BaseFragment
import com.danilkha.androidviews.app
import com.danilkha.androidviews.databinding.FragmentInfoBinding
import com.danilkha.androidviews.viewModel

class InfoFragment : BaseFragment<FragmentInfoBinding>() {

    override fun createBinding(inflater: LayoutInflater) = FragmentInfoBinding.inflate(inflater)

    val args: InfoFragmentArgs by navArgs()

    val viewModel: InfoViewModel by viewModel { InfoViewModel(
        app.repository,
        args.id
    ) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.carLiveData.observe(viewLifecycleOwner){
            Glide.with(binding.image)
                .load(it.imageUrl)
                .into(binding.image)

            binding.name.text = it.name
            binding.desc.text = it.description
        }
    }
}