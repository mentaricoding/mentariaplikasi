package com.example.project_fix_mobile

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class home: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_libio)
    }
    fun lengkap(view: View?) {
        val i = Intent(applicationContext, listbuku::class.java)
        startActivity(i)

    }
    fun baru(view: View?) {
        val i = Intent(applicationContext, bukubaru::class.java)
        startActivity(i)

    }
    fun aaa(view: View?) {
        val i = Intent(applicationContext, input::class.java)
        startActivity(i)

    }

}