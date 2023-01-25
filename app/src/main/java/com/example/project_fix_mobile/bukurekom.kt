package com.example.project_fix_mobile

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class bukurekom: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_buku_rekom)
    }
    fun buku(view: View?) {
        val i = Intent(applicationContext, detail::class.java)
        startActivity(i)

    }
    fun lkp(view: View?) {
        val i = Intent(applicationContext, konfirmasi::class.java)
        startActivity(i)

    }


}