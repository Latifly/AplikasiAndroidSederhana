package com.example.proyekakhir_dicoding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AboutPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_page)

        supportActionBar?.title = "About Me"
        getSupportActionBar()?.setDisplayHomeAsUpEnabled(true)
    }


}