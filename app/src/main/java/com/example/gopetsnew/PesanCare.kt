package com.example.gopetsnew

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_pesan_care.*

class PesanCare : AppCompatActivity() {
    val hewan = arrayOf("Kucing", "Anjing", "Kelinci", "Lainnya")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pesan_care)

        val spinner = findViewById<Spinner>(R.id.spinner)
        val arrayAdapter = ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, hewan)
        spinner.adapter = arrayAdapter

        btnPesanListener()
        btnBackListener()

    }
    private fun btnBackListener() {
        back2.setOnClickListener{
            startActivity(Intent(this, HalCare::class.java))
        }
    }

    private fun btnPesanListener() {
        pesen.setOnClickListener{
            startActivity(Intent(this, Diterima1:: class.java))
        }
    }
}