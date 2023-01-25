package com.example.project_fix_mobile

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class konfirmasi: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.konfirmasi_peminjaman)
    }

    fun ccc(view: View?) {
        val i = Intent(applicationContext, sirkulasi::class.java)
        startActivity(i)

    }
}