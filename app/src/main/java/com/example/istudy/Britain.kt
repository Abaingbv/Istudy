package com.example.istudy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Britain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_britain)
        val imageView = findViewById<ImageView>(R.id.imageView13)

        imageView.setOnClickListener {
            startActivity(Intent(this, Europe::class.java))
        }
    }
}