package com.example.timeless_haul

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ChildrenWear : AppCompatActivity() {
    lateinit var txtchildren: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_children_wear)
        txtchildren=findViewById(R.id.Txtchildren)
    }
}