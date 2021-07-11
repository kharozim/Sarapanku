package com.ozimos.android_pemuala_dicoding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ozimos.android_pemuala_dicoding.adapter.ProductListAdapter
import com.ozimos.android_pemuala_dicoding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val bindiing by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(bindiing.root)

        setview()
    }

    private fun setview() {
        val adapter = ProductListAdapter(listProduct)
        bindiing.run {
            rvListProduct.layoutManager =
                LinearLayoutManager(this@MainActivity)
            rvListProduct.adapter = adapter
        }
    }
}