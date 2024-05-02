package com.example.somnyama

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {

    private lateinit var feedBtn: Button
    private lateinit var cleanBtn: Button
    private lateinit var playBtn: Button

    private lateinit var progressBarA: ProgressBar
    private lateinit var progressBarB: ProgressBar
    private lateinit var progressBarC: ProgressBar
    private lateinit var imageView: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)


        feedBtn = findViewById(R.id.feedBtn)
       cleanBtn = findViewById(R.id.cleanBtn)
        playBtn = findViewById(R.id.playBtn)


        progressBarA = findViewById(R.id.progressBarA)
        progressBarB = findViewById(R.id.progressBarB)
        progressBarC = findViewById(R.id.progressBarC)
        imageView = findViewById(R.id.imageView)



        feedBtn.setOnClickListener {

            progressBarA.incrementProgressBy( 25)
            imageView.setImageResource(R.drawable.ani_digeating)


        }

        cleanBtn.setOnClickListener {
            progressBarB.incrementProgressBy( 25)
            imageView.setImageResource(R.drawable.ani_dogbath)

        }

        playBtn.setOnClickListener {

            progressBarC.incrementProgressBy( 25)
            imageView.setImageResource(R.drawable.ani_dogplaying)

        }








    }
}