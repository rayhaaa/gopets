package com.example.gopetsnew

import android.content.Intent
import android.os.AsyncTask
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.sql.Connection
import java.sql.ResultSet
import java.sql.Statement

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ConnectDB().execute()

        btnLoginListener()
        txtDafListener()
    }

    private fun btnLoginListener() {
        button3.setOnClickListener {
            startActivity(Intent(this, HalUtama::class.java))
        }
    }
    private fun txtDafListener() {
        dftr.setOnClickListener{
            startActivity(Intent(this, Daftar::class.java))
        }
    }

    inner class ConnectDB : AsyncTask<Void, Void, String>() {
        override fun doInBackground(vararg params: Void?): String {
            var connection: Connection? = null
            var message: String

            try {
                connection = DatabaseHelper.createConnection()

                if (connection != null) {
                    val statement: Statement = connection.createStatement()
                    val resultSet: ResultSet = statement.executeQuery("SELECT * FROM user")

                    while (resultSet.next()) {
                        val column1 = resultSet.getString("column1")
                        val column2 = resultSet.getInt("column2")

                        // Lakukan sesuatu dengan data yang diterima dari database
                    }

                    message = "Connection successful"
                } else {
                    message = "Failed to connect"
                }
            } catch (e: Exception) {
                e.printStackTrace()
                message = "Error: " + e.message
            } finally {
                connection?.close()
            }

            return message
        }

        override fun onPostExecute(result: String?) {
            // Tampilkan pesan atau lakukan tindakan lain setelah koneksi dan pengambilan data selesai
        }
    }



}