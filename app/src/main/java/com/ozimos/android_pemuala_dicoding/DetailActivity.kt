package com.ozimos.android_pemuala_dicoding

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.res.ResourcesCompat
import coil.load
import com.ozimos.android_pemuala_dicoding.adapter.CompositionDetailAdapter
import com.ozimos.android_pemuala_dicoding.databinding.ActivityDetailBinding
import com.ozimos.android_pemuala_dicoding.databinding.LayoutImageDialogBinding

class DetailActivity : AppCompatActivity() {

    private val binding by lazy { ActivityDetailBinding.inflate(layoutInflater) }
    private lateinit var data: Product

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        window.statusBarColor = ResourcesCompat.getColor(resources, R.color.black,null)

        getData()
        setView()

    }

    private fun getData() {
        data = intent.getParcelableExtra(EXTRA_DATA_PRODUCT) ?: Product()
    }

    private fun setView() {
        binding.run {
            ivDetailProduct.load(data.image){
                placeholder(R.mipmap.ic_logo)
            }
            ivDetailProduct.setOnClickListener { showDialogPicture() }
            tvDescription.text = data.desc
            tvDetailProductName.text = data.name
            tvCalory.text = data.calory
            tvTime.text = data.time
            setAdapterCompositioin()
        }
    }

    private fun setAdapterCompositioin() {
        val adapter = CompositionDetailAdapter(data.composition)
        binding.rvListComposition.adapter = adapter
        binding.rvListComposition.scheduleLayoutAnimation()
    }

    private fun showDialogPicture() {
        val dialog = Dialog(this, R.style.Base_Theme_AppCompat_Dialog_MinWidth)
        val dialogBinding = LayoutImageDialogBinding.inflate(layoutInflater)
        dialog.window?.setBackgroundDrawable(
            ResourcesCompat.getDrawable(
                resources,
                R.color.transparent,
                null
            )
        )
        dialogBinding.ivImageDialog.load(data.image){
            placeholder(R.mipmap.ic_logo)
        }
        dialog.setContentView(dialogBinding.root)
        dialog.show()
    }

    companion object {
        const val EXTRA_DATA_PRODUCT = "EXTRA_DATA_PRODUCT"
    }
}