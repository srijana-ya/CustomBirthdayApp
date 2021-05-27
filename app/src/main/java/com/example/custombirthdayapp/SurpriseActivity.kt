package com.example.custombirthdayapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SurpriseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_surprise2)

        val first: Button = findViewById(R.id.hairMask)
        first.setOnClickListener{
            val intent = Intent(this, GiftOneActivity::class.java)
            startActivity(intent)
        }

        val second: Button = findViewById(R.id.naruto)
        second.setOnClickListener{
            val intent = Intent(this, GiftTwoActivity::class.java)
            startActivity(intent)
        }


    }
}