package com.example.timeless_haul

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HelpActivity : AppCompatActivity() {
    lateinit var txthelp: TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_help)
        txthelp=findViewById(R.id.Txthelp)
    }
}