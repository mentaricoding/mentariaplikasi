package com.example.project_fix_mobile

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class login: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
    }
    fun masuk(view: View?) {
        val i = Intent(applicationContext, home::class.java)
        startActivity(i)

    }
    fun Daftar(view: View?) {
        val i = Intent(applicationContext, signup::class.java)
        startActivity(i)

    }

}
