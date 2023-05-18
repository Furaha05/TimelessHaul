package com.example.timeless_haul

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class WomenActivity : AppCompatActivity() {
    lateinit var txtwomen: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_women)
        txtwomen=findViewById(R.id.Txtwomen)
    }
}