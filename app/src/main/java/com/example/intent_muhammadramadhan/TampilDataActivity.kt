package com.example.intent_muhammadramadhan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Button
import android.net.Uri
import android.content.Intent


class TampilDataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tampil_data)

        val tvData = findViewById<TextView>(R.id.tvData)

        val nim = intent.getStringExtra("NIM")
        val nama = intent.getStringExtra("Nama")

        tvData.text = """
            Data yang dimasukkan:
            NIM : $nim
            Nama : $nama
        """.trimIndent()

        val btnWeb = findViewById<Button>(R.id.btnWeb)

        btnWeb.setOnClickListener{
            val link = "https://www.atmaluhur.ac.id"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(link)
            startActivity(i)
        }
    }
}