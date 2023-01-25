package com.example.project_fix_mobile

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class onboarding_dua: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_on_boarding2)
    }
    fun skip2(view: View?) {
        val i = Intent(applicationContext, login::class.java)
        startActivity(i)
    }
    fun dua(view: View?) {
        val i = Intent(applicationContext, onboarding_tiga::class.java)
        startActivity(i)
    }
}