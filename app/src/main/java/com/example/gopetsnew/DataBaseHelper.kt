package com.example.gopetsnew

import java.sql.Connection
import java.sql.DriverManager

class DatabaseHelper {
    companion object {
        fun createConnection(): Connection? {
            var connection: Connection? = null
            val url = "jdbc:mysql://<localhost>:<3306>/<beta_gopets>"
            val username = "<root>"
            val password = ""

            try {
                Class.forName("com.mysql.cj.jdbc.Driver")
                connection = DriverManager.getConnection(url, username, password)
            } catch (e: Exception) {
                e.printStackTrace()
            }

            return connection
        }
    }
}
