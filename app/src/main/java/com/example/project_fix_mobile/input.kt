package com.example.project_fix_mobile

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class input: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.input_tanggal_peminjaman)
    }
    fun bbb(view: View?) {
        val i = Intent(applicationContext, konfirmasi::class.java)
        startActivity(i)

    }

}