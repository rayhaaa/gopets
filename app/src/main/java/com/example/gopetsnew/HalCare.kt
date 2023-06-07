package com.example.gopetsnew

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_hal_care.*

class HalCare : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hal_care)

        btnBackListener()
        btnPs1Listener()
    }

    private fun btnBackListener() {
        back2.setOnClickListener {
            startActivity(Intent(this, HalUtama::class.java))
        }
    }

    private fun btnPs1Listener() {
        ps1.setOnClickListener{
            startActivity(Intent(this, PesanCare::class.java))
        }
    }
}