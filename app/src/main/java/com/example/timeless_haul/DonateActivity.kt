package com.example.timeless_haul

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DonateActivity : AppCompatActivity() {
    lateinit var txtdonate: TextView
    lateinit var txtparticipate: TextView
    lateinit var txtinfo: TextView
    lateinit var txtdiff: TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_donate)
        txtdiff=findViewById(R.id.Txtdiff)
        txtdonate=findViewById(R.id.Txtdonate)
        txtinfo=findViewById(R.id.Txtinfo)
        txtparticipate=findViewById(R.id.Txtparticipate)
    }
}