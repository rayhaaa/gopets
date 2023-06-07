package com.example.gopetsnew

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cover1.*
import kotlinx.android.synthetic.main.activity_main.*

class Cover1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cover1)

        btnLanjutListener()
    }

    private fun btnLanjutListener() {
        ljt1.setOnClickListener {
            startActivity(Intent(this, Cover2::class.java))
        }
    }
}