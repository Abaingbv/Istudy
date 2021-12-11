package com.example.istudy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivityContinent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_continent)
        val imageView1 = findViewById<ImageView>(R.id.imageViewAsia)

        imageView1.setOnClickListener {
            startActivity(Intent(this,MainActivityAsia::class.java))
        }
    }
}