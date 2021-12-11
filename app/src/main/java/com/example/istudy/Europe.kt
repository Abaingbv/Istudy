package com.example.istudy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Europe : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_europe)

        val imageView = findViewById<ImageView>(R.id.ImageViewBritanya)

        imageView.setOnClickListener {
            startActivity(Intent(this, Britain::class.java))
        }
    }
}