package com.example.custombirthdayapp

import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class GiftOneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gift_one)

        val h = findViewById<TextView>(R.id.textView4)
        h.movementMethod = LinkMovementMethod.getInstance()
    }
}
