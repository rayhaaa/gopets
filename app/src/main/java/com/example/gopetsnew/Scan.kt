package com.example.gopetsnew

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_scan.*

class Scan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scan)

        btnConfirListener()
    }

    private fun btnConfirListener(){
        confir.setOnClickListener {
            startActivity(Intent(this, Diterima1::class.java))
        }
    }
}