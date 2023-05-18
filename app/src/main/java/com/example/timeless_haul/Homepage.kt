package com.example.timeless_haul

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Homepage : AppCompatActivity() {
    lateinit var btnwomen: Button
    lateinit var btnmen: Button
    lateinit var btnchildren: Button
    lateinit var btnNewarrivals: Button
    lateinit var btnshoes: Button
    lateinit var btnOnsale: Button
    lateinit var img_home: ImageView
    lateinit var imgFeedback: ImageView
    lateinit var imgDonate: ImageView
    lateinit var imgHelp: ImageView
    lateinit var imgsettings: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)
        btnmen = findViewById(R.id.btnmen)
        btnshoes = findViewById(R.id.btnshoes)
        btnchildren = findViewById(R.id.btnchildren)
        btnwomen = findViewById(R.id.btnwomen)
        btnOnsale = findViewById(R.id.btnOnsale)
        btnNewarrivals = findViewById(R.id.btnNewArrivals)
        imgFeedback = findViewById(R.id.imgFeedback)
        imgDonate = findViewById(R.id.imgDonate)
        imgHelp = findViewById(R.id.imgHelp)
        imgsettings = findViewById(R.id.imgsettings)
        img_home = findViewById(R.id.imghome)

        btnmen.setOnClickListener {
            val intent = Intent(this, MensActivity::class.java)
            startActivity(intent)
        }
        btnNewarrivals.setOnClickListener {
            val intent = Intent(this, NewArrival::class.java)
            startActivity(intent)
        }
        btnwomen.setOnClickListener {
            val intent = Intent(this, WomenActivity::class.java)
            startActivity(intent)
        }
        btnchildren.setOnClickListener {
            val intent = Intent(this, ChildrenWear::class.java)
            startActivity(intent)
        }
        btnOnsale.setOnClickListener {
            val intent = Intent(this, OnsaleActivity::class.java)
            startActivity(intent)
        }
        btnshoes.setOnClickListener {
            val intent = Intent(this, ShoeActivity::class.java)
            startActivity(intent)
        }
        imgsettings.setOnClickListener {
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }
        img_home.setOnClickListener {
            val intent = Intent(this, Homepage::class.java)
            startActivity(intent)
        }
        imgFeedback.setOnClickListener {
            val intent = Intent(this, FeedbackActivity::class.java)
            startActivity(intent)
        }

        imgDonate.setOnClickListener {
            val intent = Intent(this, DonateActivity::class.java)
            startActivity(intent)
        }
        imgHelp.setOnClickListener {
            val intent = Intent(this, HelpActivity::class.java)
            startActivity(intent)
        }

    }
}