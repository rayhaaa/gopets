package com.example.gopetsnew

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_pesan_shop.*

class PesanShop : AppCompatActivity() {
    val metode = arrayOf("QRIS", "GoPay", "OVO", "Lainnya")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pesan_shop)

        val spinner = findViewById<Spinner>(R.id.spinner)
        val arrayAdapter = ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, metode)
        spinner.adapter = arrayAdapter

        btnPesanListener()
        btnbackListener()
    }

    private fun btnbackListener(){
        back3.setOnClickListener{
            startActivity(Intent(this, HalShop::class.java))
        }
    }

    private fun btnPesanListener() {
        pesan.setOnClickListener {
            startActivity(Intent(this, Scan:: class.java))
        }
    }


}