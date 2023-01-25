package com.example.project_fix_mobile

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class listbuku: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_buku_rekom)
    }
    fun baru(view: View?) {
        val i = Intent(applicationContext, bukubaru::class.java)
        startActivity(i)

    }


}