package ru.bmstu.iu3.rcgnzr

import java.sql.DriverManager

const val DB_URL = "jdbc:postgresql://localhost:5432/rcgnzr_db"
const val USER = "postgres"
const val PASS = ""

fun main() {

    val connection = try {
        DriverManager.getConnection(DB_URL ,USER, PASS)
    } catch (e: Exception) {
        println("Error:\n${e.printStackTrace()}")
    }

    if (connection != null) {
        println("You successfully connected to database now")
    } else {
       println("Failed to make connection to database")
    }
}