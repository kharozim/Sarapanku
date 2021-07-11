package com.ozimos.android_pemuala_dicoding.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.ozimos.android_pemuala_dicoding.Product
import com.ozimos.android_pemuala_dicoding.R
import com.ozimos.android_pemuala_dicoding.databinding.ItemProductGridBinding

class ProductGridAdapter(private val items: List<Product>) :
    RecyclerView.Adapter<ProductGridAdapter.GridViewHolder>() {

    private lateinit var onItemClick: OnItemClickListener
    fun onClick(listener: OnItemClickListener) {
        onItemClick = listener
    }

    inner class GridViewHolder(private val binding: ItemProductGridBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bindData(item: Product, position: Int) {
            binding.run {
                tvTitle.text = item.name
                ivProduct.load(item.image) {
                    placeholder(R.mipmap.ic_logo)
                }
                root.setOnClickListener {
                    onItemClick.onClick(position, item)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridViewHolder {
        return GridViewHolder(
            ItemProductGridBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        holder.bindData(items[position], position)
    }

    override fun getItemCount(): Int = items.size

}