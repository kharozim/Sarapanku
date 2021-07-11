package com.ozimos.android_pemuala_dicoding.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.ozimos.android_pemuala_dicoding.Product
import com.ozimos.android_pemuala_dicoding.R
import com.ozimos.android_pemuala_dicoding.databinding.ItemProductLinearBinding

class ProductListAdapter(private val items : List<Product>) :
    RecyclerView.Adapter<ProductListAdapter.ListViewHolder>() {

//    private lateinit var onItemClick


    inner class ListViewHolder(private val binding: ItemProductLinearBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bindData(item: Product, position: Int) {
            val compositionAdapter = CompositoinAdapter(item.composition)
            binding.run {
                tvTitle.text = item.name
                tvDesc.text = item.desc
                ivProduct.load(item.image) {
                    placeholder(R.mipmap.ic_logo)
                }
                rvListComposition.adapter = compositionAdapter
                rvListComposition.setHasFixedSize(false)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        return ListViewHolder(
            ItemProductLinearBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bindData(items[position], position)
    }

    override fun getItemCount(): Int = items.size

}