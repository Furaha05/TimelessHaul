package com.example.timeless_haul

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ShoeActivity : AppCompatActivity() {
    lateinit var txtdisplay: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shoe)
        txtdisplay=findViewById(R.id.Txtdisplay)
    }
}