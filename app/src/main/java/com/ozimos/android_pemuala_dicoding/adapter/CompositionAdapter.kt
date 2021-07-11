package com.ozimos.android_pemuala_dicoding.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ozimos.android_pemuala_dicoding.databinding.ItemCompositionBinding

class CompositionAdapter(private val items: List<String>) :
    RecyclerView.Adapter<CompositionAdapter.CompositionViewHolder>() {
    inner class CompositionViewHolder(val binding: ItemCompositionBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bindData(item: String) {
            binding.tvComposition.text = item
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CompositionViewHolder {
        return CompositionViewHolder(
            ItemCompositionBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: CompositionAdapter.CompositionViewHolder, position: Int) {
        holder.bindData(items[position])
    }

    override fun getItemCount(): Int = items.size
}