package com.example.latihan2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    private lateinit var register: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        register = findViewById(R.id.textregister)
        register.setOnClickListener {
            startActivity(Intent(this, Register::class.java))
        }
    }
}

/*
Tanggal pengerjaan : Pada tanggal 16/4/2020 mengerjakan class dan layout sebagian, tanggal 17/4/20,
mengerjakan sebagian lagi dan di validasi.
Riki Ahmad Fauzi
10117153
IF-4
 */