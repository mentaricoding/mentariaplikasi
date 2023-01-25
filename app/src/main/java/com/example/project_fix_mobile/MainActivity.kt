package com.example.project_fix_mobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_splash_screen)

        var handler = Handler()
        handler.postDelayed({
            var intent = Intent(this@MainActivity, onboarding_satu::class.java)
            startActivity(intent)
            finish()
        }, 5000)
    }
}