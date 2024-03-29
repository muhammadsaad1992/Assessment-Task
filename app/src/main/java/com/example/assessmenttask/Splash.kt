package com.example.assessmenttask

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val mHandler = Handler()
        mHandler.postDelayed({
            startActivity(Intent(this@Splash, MainActivity::class.java))
            finish()
        }, 3000)
    }
}