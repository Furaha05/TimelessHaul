package com.example.timeless_haul

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class OnsaleActivity : AppCompatActivity() {
    lateinit var txtOnsale: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onsale)
        txtOnsale=findViewById(R.id.TxtOnsale)
    }
}