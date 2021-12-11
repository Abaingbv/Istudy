package com.example.istudy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivityAsia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_asia)
        val imageView1 = findViewById<ImageView>(R.id.imageView47)

        imageView1.setOnClickListener {
            startActivity(Intent(this,MainActivityJapan::class.java))
        }
        val imageView2 = findViewById<ImageView>(R.id.imageView46)

        imageView2.setOnClickListener {
            startActivity(Intent(this,MainActivityChina::class.java))
        }
    }
}