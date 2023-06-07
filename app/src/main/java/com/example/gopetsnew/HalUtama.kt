package com.example.gopetsnew

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_hal_utama.*
import kotlinx.android.synthetic.main.activity_main.*

class HalUtama : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hal_utama)

        btnCareListener()
        btnShopListener()
    }

    private fun btnCareListener() {
        care.setOnClickListener {
            startActivity(Intent(this, HalCare::class.java))
        }
    }

    private fun btnShopListener() {
        shop.setOnClickListener {
            startActivity(Intent(this, HalShop::class.java))
        }
    }
}