package com.example.st10454062.gif

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity3 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val tryButton = findViewById<Button>(R.id.try_btn)
        tryButton.setOnClickListener{
            val intent = Intent(this,MainActivity2::class.java)
            //pressing the try again button will redirect it to the second activity page
            startActivity(intent)
        }
        val homeButton = findViewById<Button>(R.id.home_btn)
        homeButton.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            //pressing the start button will redirect it to the first activity page
            startActivity(intent)
        }

    }
}