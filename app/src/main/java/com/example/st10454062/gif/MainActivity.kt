package com.example.st10454062.gif


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startButton = findViewById<Button>(R.id.button)
        startButton.setOnClickListener{
            val intent = Intent(this,MainActivity2::class.java)
            // by pressing the button the activity will change to the second
            // activity which is MainActivity2
            startActivity(intent)
        }


    }
}