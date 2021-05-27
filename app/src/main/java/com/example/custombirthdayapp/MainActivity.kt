package com.example.custombirthdayapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val first: Button = findViewById(R.id.messageButton)
        first.setOnClickListener{
            val intent = Intent(this, MessageActivity::class.java)
            startActivity(intent)
        }

        val second: Button = findViewById(R.id.cakeButton)
        second.setOnClickListener{
            val intent = Intent(this, DoodleActivity::class.java)
            startActivity(intent)
        }

        val third: Button = findViewById(R.id.giftButton)
        third.setOnClickListener{
            val intent = Intent(this, SurpriseActivity::class.java)
            startActivity(intent)
        }
    }
}