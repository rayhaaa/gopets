package com.example.gopetsnew

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_diterima1.*

class Diterima1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diterima1)

        btnBackListener()

        val bottomSheetFragment = BottomSheetFragment()

        detilpesan.setOnClickListener {
            bottomSheetFragment.show(supportFragmentManager, "BottomSheetDialog")
        }
    }

    private fun btnBackListener() {
        btnback.setOnClickListener {
            startActivity(Intent(this, HalUtama::class.java))
        }
    }
}