package com.ozimos.android_pemuala_dicoding

import android.app.Dialog
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import coil.load
import coil.size.Scale
import com.bumptech.glide.Glide
import com.ozimos.android_pemuala_dicoding.databinding.ActivityProfileBinding
import com.ozimos.android_pemuala_dicoding.databinding.LayoutImageDialogBinding

class ProfileActivity : AppCompatActivity() {

    private val binding by lazy { ActivityProfileBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.ivProfile.setOnClickListener {
            showDialogPicture()
        }
        binding.tbProfile.setNavigationOnClickListener {
            onBackPressed()
        }
    }

    private fun showDialogPicture() {
        val dialog = Dialog(this, R.style.Base_Theme_AppCompat_Light_Dialog_MinWidth)
        val dialogBinding = LayoutImageDialogBinding.inflate(layoutInflater)
        dialog.window?.setBackgroundDrawable(
            ResourcesCompat.getDrawable(
                resources,
                R.color.transparent,
                null
            )
        )
        dialogBinding.ivImageDialog.setImageResource(R.drawable.ic_my)
        dialog.setContentView(dialogBinding.root)
        dialog.show()
    }
}