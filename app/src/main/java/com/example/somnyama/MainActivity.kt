package com.example.somnyama

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var btnOne: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        btnOne = findViewById(R.id.btnOne)

        btnOne.setOnClickListener {

            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
            finish()


        }

        }
    }
