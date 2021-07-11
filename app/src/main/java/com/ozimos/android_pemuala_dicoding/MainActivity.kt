package com.ozimos.android_pemuala_dicoding

import android.content.Intent
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.LayoutAnimationController
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.ozimos.android_pemuala_dicoding.DetailActivity.Companion.EXTRA_DATA_PRODUCT
import com.ozimos.android_pemuala_dicoding.adapter.OnItemClickListener
import com.ozimos.android_pemuala_dicoding.adapter.ProductGridAdapter
import com.ozimos.android_pemuala_dicoding.adapter.ProductListAdapter
import com.ozimos.android_pemuala_dicoding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private var gridView = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setListViewLayout()
        binding.ivGrid.setOnClickListener {
            setListorGridView()
        }
        binding.ivProfile.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }
    }

    private fun setListorGridView() {
        binding.ivGrid.setImageResource(if (gridView) R.drawable.ic_grid_view else R.drawable.ic_list_view)

        if (!gridView) {
            setGridViewLayout()
            gridView = true
        } else {
            setListViewLayout()
            gridView = false
        }
    }

    private fun setGridViewLayout() {
        val adapter = ProductGridAdapter(listProduct)
        adapter.onClick(object : OnItemClickListener {
            override fun onClick(position: Int, data: Any?) {
                data as Product
                startActivity(
                    Intent(this@MainActivity, DetailActivity::class.java)
                        .putExtra(EXTRA_DATA_PRODUCT, data)
                )
            }

        })
        binding.run {
            rvListProduct.layoutManager = StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL)
            rvListProduct.adapter = adapter
            rvListProduct.setHasFixedSize(true)
            rvListProduct.scheduleLayoutAnimation()
        }
    }

    private fun setListViewLayout() {
        val adapter = ProductListAdapter(listProduct)
        adapter.clickItem(object : OnItemClickListener {
            override fun onClick(position: Int, data: Any?) {
                data as Product
                startActivity(
                    Intent(this@MainActivity, DetailActivity::class.java)
                        .putExtra(EXTRA_DATA_PRODUCT, data)
                )
            }
        })
        binding.run {
            rvListProduct.layoutManager = LinearLayoutManager(this@MainActivity)
            rvListProduct.adapter = adapter
            rvListProduct.setHasFixedSize(true)
            rvListProduct.scheduleLayoutAnimation()
        }
    }
}