package com.example.timeless_haul

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class NewArrival : AppCompatActivity() {
    lateinit var txtnew: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_arrival)
        txtnew=findViewById(R.id.Txtnew)
    }
}