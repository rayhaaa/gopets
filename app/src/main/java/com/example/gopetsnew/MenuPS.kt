package com.example.gopetsnew

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class MenuPS : AppCompatActivity() {
    val menu = arrayOf("Makanan Kucing", "Makanan Anjing", "Perawatan", "Aksesori", "Lainnya")
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_ps)

        val spinner = findViewById<Spinner>(R.id.spinner)
        val arrayAdapter = ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, menu)
        spinner.adapter = arrayAdapter
    }
}