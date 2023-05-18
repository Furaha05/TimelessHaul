package com.example.timeless_haul

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button




class FirstActivity : AppCompatActivity() {
    lateinit var btnstart: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        btnstart = findViewById(R.id.btnstart)
        btnstart.setOnClickListener {
            val intent= Intent( this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}