package com.example.st10454062.gif

import android.annotation.SuppressLint
import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    private var feedProgressCount: Int = 0 //initializing the counter for the progressbar
    private var cleanProgressCount: Int = 0
    private var playProgressCount: Int = 0
    private val handler = Handler(Looper.getMainLooper())


    private val delayMax: Long = 5000//5 seconds delay

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val feed_progressbar = findViewById<ProgressBar>(R.id.feed_progressbar)
        val clean_progressbar = findViewById<ProgressBar>(R.id.clean_progressbar)
        val play_progressbar = findViewById<ProgressBar>(R.id.play_progressbar)
        val play_btn = findViewById<Button>(R.id.play_btn)
        val clean_btn = findViewById<Button>(R.id.clean_btn)
        val feed_btn = findViewById<Button>(R.id.feed_btn)

        val feed_txt = findViewById<TextView>(R.id.feed_txt)
        val clean_txt = findViewById<TextView>(R.id.clean_txt)
        val play_txt = findViewById<TextView>(R.id.play_txt)
        val imageView = findViewById<ImageView>(R.id.imageView)

        val feedProgress = findViewById<TextView>(R.id.feedProgress)
        val cleanProgress = findViewById<TextView>(R.id.cleanProgress)
        val playProgress = findViewById<TextView>(R.id.playProgress)

        imageView.setImageResource(R.drawable.peace)

        feed_btn.setOnClickListener {
            imageView.setImageResource(R.drawable.carrot)
            Thread {
                while (feedProgressCount < 100) {
                    feedProgressCount++

                    try {
                        Thread.sleep(40)
                    } catch (e: InterruptedException) {
                        e.printStackTrace()
                    } //(Stack Overflow, 2012) https://stackoverflow.com/questions/10317041/exception-handling-in-case-of-thread-sleep-and-wait-method-in-case-of-threads

                    handler.post { //(Stack Overflow, 2013) https://stackoverflow.com/questions/15136199/when-to-use-handler-post-when-to-new-thread
                        feed_progressbar.progress = feedProgressCount
                        feed_txt.text = "$feedProgressCount%"

                        if (feedProgressCount <= 35){
                            feed_progressbar.progressTintList= ColorStateList.valueOf(Color.RED) // (Stack Overflow, 2012) https://stackoverflow.com/questions/10951978/change-progressbar-color-through-code-only-in-android
                        }
                        if (feedProgressCount >= 36 && feedProgressCount <= 75)run {
                            feed_progressbar.progressTintList = ColorStateList.valueOf(Color.YELLOW)
                        }
                        if (feedProgressCount >= 76 && feedProgressCount <= 100)run {
                            feed_progressbar.progressTintList = ColorStateList.valueOf(Color.GREEN)
                        }
                        feedProgress.text = "eating..."

                        if (feedProgressCount == feed_progressbar.max) {
                            handler.postDelayed({
                                feed_progressbar.progressTintList= ColorStateList.valueOf(Color.GREEN)

                            }, delayMax)
                        }
                    }
                }
                while (feedProgressCount > 0) {
                    feedProgressCount--
                    try {
                        Thread.sleep(80)
                    } catch (e: InterruptedException) {
                        e.printStackTrace()
                    }
                    handler.post {
                        feed_progressbar.progress = feedProgressCount
                        feed_txt.text = "$feedProgressCount%"
                        feedProgress.text = ""
                        if (feedProgressCount >= 76 && feedProgressCount <= 100)run {
                            feed_progressbar.progressTintList = ColorStateList.valueOf(Color.GREEN)
                        }
                        if (feedProgressCount >= 36 && feedProgressCount <= 75)run {
                            feed_progressbar.progressTintList = ColorStateList.valueOf(Color.YELLOW)
                        }
                        if (feedProgressCount <= 35){
                            feed_progressbar.progressTintList= ColorStateList.valueOf(Color.RED)
                        }
                        if (feedProgressCount == feed_progressbar.min) {
                            feed_progressbar.progressTintList= ColorStateList.valueOf(Color.RED)
                            feed_txt.text =""

                            feedProgress.text = ""
                            if (feedProgressCount == feed_progressbar.min && cleanProgressCount == clean_progressbar.min && playProgressCount == play_progressbar.min){
                                val intent = Intent(this,MainActivity3::class.java)
                                startActivity(intent)
                            }

                        }
                    }
                }
            }.start()
        }

        clean_btn.setOnClickListener {
            imageView.setImageResource(R.drawable.clean)
            Thread {
                while (cleanProgressCount < 100) {
                    cleanProgressCount++

                    try {
                        Thread.sleep(40)
                    } catch (e: InterruptedException) {
                        e.printStackTrace()
                    }
                    handler.post {
                        clean_progressbar.progress = cleanProgressCount
                        clean_txt.text = "$cleanProgressCount%"

                        if (cleanProgressCount <= 35){
                            clean_progressbar.progressTintList= ColorStateList.valueOf(Color.RED)
                        }
                        if (cleanProgressCount >= 36 && cleanProgressCount <= 75)run {
                            clean_progressbar.progressTintList = ColorStateList.valueOf(Color.YELLOW)
                        }
                        if (cleanProgressCount >= 76 && cleanProgressCount <= 100)run {
                            clean_progressbar.progressTintList = ColorStateList.valueOf(Color.GREEN)
                        }
                        cleanProgress.text = "cleaning..."
                        if (cleanProgressCount == clean_progressbar.max) {
                            handler.postDelayed({
                                clean_progressbar.progressTintList= ColorStateList.valueOf(Color.GREEN)
                            }, delayMax)
                        }
                    }
                }
                while (cleanProgressCount > 0) {
                    cleanProgressCount--
                    try {
                        Thread.sleep(80)
                    } catch (e: InterruptedException) {
                        e.printStackTrace()
                    }
                    handler.post {
                        clean_progressbar.progress = cleanProgressCount
                        clean_txt.text = "$cleanProgressCount%"
                        cleanProgress.text = ""
                        if (cleanProgressCount >= 76 && cleanProgressCount <= 100)run {
                            clean_progressbar.progressTintList = ColorStateList.valueOf(Color.GREEN)
                        }
                        if (cleanProgressCount >= 36 && cleanProgressCount <= 75)run {
                            clean_progressbar.progressTintList = ColorStateList.valueOf(Color.YELLOW)
                        }
                        if (cleanProgressCount <= 35){
                            clean_progressbar.progressTintList= ColorStateList.valueOf(Color.RED)
                        }
                        if (cleanProgressCount == clean_progressbar.min) {
                            clean_progressbar.progressTintList= ColorStateList.valueOf(Color.RED)
                            clean_txt.text =""

                            cleanProgress.text = ""
                            if (feedProgressCount == feed_progressbar.min && cleanProgressCount == clean_progressbar.min && playProgressCount == play_progressbar.min){
                                val intent = Intent(this,MainActivity3::class.java)
                                startActivity(intent)
                            }

                        }
                    }
                }
            }.start()
        }

        play_btn.setOnClickListener {
            imageView.setImageResource(R.drawable.computer)
            Thread {
                while (playProgressCount < 100) {
                    playProgressCount++
                    try {
                        Thread.sleep(40)
                    } catch (e: InterruptedException) {
                        e.printStackTrace()
                    }
                    handler.post {
                        play_progressbar.progress = playProgressCount
                        play_txt.text = "$playProgressCount%"
                        if (playProgressCount <= 35){
                            play_progressbar.progressTintList= ColorStateList.valueOf(Color.RED)
                        }
                        if (playProgressCount >= 36 && playProgressCount <= 75)run {
                            play_progressbar.progressTintList = ColorStateList.valueOf(Color.YELLOW)
                        }
                        if (playProgressCount >= 76 && playProgressCount <= 100)run {
                            play_progressbar.progressTintList = ColorStateList.valueOf(Color.GREEN)
                        }

                        playProgress.text = "playing..."

                        if (playProgressCount == play_progressbar.max) {
                            handler.postDelayed({
                                play_progressbar.progressTintList= ColorStateList.valueOf(Color.GREEN)

                            }, delayMax)
                        }
                    }
                }
                while (playProgressCount > 0) {
                    playProgressCount--
                    try {
                        Thread.sleep(80)
                    } catch (e: InterruptedException) {
                        e.printStackTrace()
                    }
                    handler.post {
                        play_progressbar.progress = playProgressCount
                        play_txt.text = "$playProgressCount%"
                        playProgress.text = ""
                        if (playProgressCount >= 76 && playProgressCount <= 100)run {
                            play_progressbar.progressTintList = ColorStateList.valueOf(Color.GREEN)
                        }
                        if (playProgressCount >= 36 && playProgressCount <= 75)run {
                            play_progressbar.progressTintList = ColorStateList.valueOf(Color.YELLOW)
                        }
                        if (playProgressCount <= 35){
                            play_progressbar.progressTintList= ColorStateList.valueOf(Color.RED)
                        }
                        if (playProgressCount == play_progressbar.min) {
                            play_progressbar.progressTintList= ColorStateList.valueOf(Color.RED)
                            play_txt.text =""

                            playProgress.text = ""
                            if (feedProgressCount == feed_progressbar.min && cleanProgressCount == clean_progressbar.min && playProgressCount == play_progressbar.min){
                                val intent = Intent(this,MainActivity3::class.java)
                                startActivity(intent)

                            }
                        }
                    }
                }
            }.start()
        }
    }
}


