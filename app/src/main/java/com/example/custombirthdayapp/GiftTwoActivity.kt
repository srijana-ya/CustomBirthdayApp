package com.example.custombirthdayapp

import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class GiftTwoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gift_two)

        val n = findViewById<TextView>(R.id.textView7)
        n.movementMethod = LinkMovementMethod.getInstance()
    }
}