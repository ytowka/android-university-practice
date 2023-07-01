package com.danilkha.androidviews.fragments

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.danilkha.androidviews.data.Car
import com.danilkha.androidviews.databinding.ItemCarBinding

class CarListAdapter(val onCarClicked: (Long) -> Unit) : RecyclerView.Adapter<CarListAdapter.CarViewHolder>(){

    var list: List<Car> = emptyList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarViewHolder {
        return CarViewHolder(
            onCarClicked,
            ItemCarBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = list.size


    override fun onBindViewHolder(holder: CarViewHolder, position: Int) {
        holder.bind(list[position])
    }

    class CarViewHolder(
        val onCarClicked: (Long) -> Unit,
        val binding: ItemCarBinding,
    ) : RecyclerView.ViewHolder(binding.root){

        fun bind(car: Car){
            Glide.with(binding.image)
                .load(car.imageUrl)
                .centerCrop()
                .into(binding.image)

            binding.name.text = car.name

            binding.root.setOnClickListener {
                onCarClicked(car.id)
            }
        }
    }

}