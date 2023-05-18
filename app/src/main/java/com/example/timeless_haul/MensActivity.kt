package com.example.timeless_haul

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MensActivity : AppCompatActivity() {
    lateinit var txtmen: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mens)
        txtmen=findViewById(R.id.Txtmen)
    }
}