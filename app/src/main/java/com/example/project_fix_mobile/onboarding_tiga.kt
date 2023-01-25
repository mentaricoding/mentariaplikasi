package com.example.project_fix_mobile

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class onboarding_tiga: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_on_boarding3)


    }
    fun tiga(view: View?) {
        val i = Intent(applicationContext, login::class.java)
        startActivity(i)
    }
    fun skip3(view: View?) {
        val i = Intent(applicationContext, onboarding_dua::class.java)
        startActivity(i)
    }
}