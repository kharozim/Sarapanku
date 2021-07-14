package com.ozimos.android_pemuala_dicoding.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.bumptech.glide.Glide
import com.ozimos.android_pemuala_dicoding.Product
import com.ozimos.android_pemuala_dicoding.R
import com.ozimos.android_pemuala_dicoding.databinding.ItemProductLinearBinding

class ProductListAdapter(private val context: Context, private val items: List<Product>) :
    RecyclerView.Adapter<ProductListAdapter.ListViewHolder>() {

    private lateinit var onItemClick: OnItemClickListener
    fun clickItem(listener: OnItemClickListener) {
        onItemClick = listener
    }


    inner class ListViewHolder(private val binding: ItemProductLinearBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bindData(item: Product, position: Int) {
            val compositionAdapter = CompositionAdapter(item.composition)
            binding.run {
                tvTitle.text = item.name
                tvDesc.text = item.desc
                Glide.with(context).load(item.image).into(ivProduct)
                rvListComposition.adapter = compositionAdapter
                rvListComposition.setHasFixedSize(false)

                root.setOnClickListener {
                    onItemClick.onClick(position, item)
                }
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