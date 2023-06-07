package com.example.gopetsnew

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_hal_shop.*

class HalShop : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hal_shop)

        btnBackListener()
        btnPs9Listener()
    }

    private fun btnBackListener() {
        back1.setOnClickListener {
            startActivity(Intent(this, HalUtama::class.java))
        }
    }
    private fun btnPs9Listener() {
        ps1.setOnClickListener {
            startActivity(Intent(this, PesanShop::class.java))
        }
    }
}