package com.example.gopetsnew

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cover2.*

class Cover2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cover2)

        btnLanjutLagiListener()
    }

    private fun btnLanjutLagiListener() {
        ljt2.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}