package com.example.timeless_haul

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BeforeHomepage : AppCompatActivity() {
    lateinit var btnseller: Button
    lateinit var btnbuyer: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_before_homepage)
        btnbuyer = findViewById(R.id.btnBuyer)
        btnseller = findViewById(R.id.btnSeller)

        btnseller.setOnClickListener {
            val intent = Intent(this, SellersActivity::class.java)
            startActivity(intent)
        }
        btnbuyer.setOnClickListener {
            val intent = Intent(this, Homepage::class.java)
            startActivity(intent)
        }

    }
}