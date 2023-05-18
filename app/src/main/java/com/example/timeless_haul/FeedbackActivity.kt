package com.example.timeless_haul

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RatingBar
import android.widget.TextView
import com.google.firebase.FirebaseApp
import com.google.firebase.firestore.FirebaseFirestore


class FeedbackActivity : AppCompatActivity() {
    private lateinit var db:FirebaseFirestore
    lateinit var txtmatters: TextView
    lateinit var txtshop: TextView
    lateinit var btnsubmit: Button
    lateinit var edtreviews: EditText
    lateinit var txtabout: TextView
    lateinit var ratingBar: RatingBar
    lateinit var txtrate: TextView


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feedback)
        FirebaseApp.initializeApp(this)
        db = FirebaseFirestore.getInstance()

        txtmatters = findViewById(R.id.txtMatters)
        txtshop = findViewById(R.id.txt_shop)
        txtabout = findViewById(R.id.txt_about)
        txtrate = findViewById(R.id.txt_rate)
        edtreviews = findViewById(R.id.edt_review)
        ratingBar = findViewById(R.id.ratingBar)


        val submitButton = findViewById<Button>(R.id.btn_sub)
        submitButton.setOnClickListener {
            val reviewText = edtreviews.text.toString()

            // Save the review to Firebase Firestore
            hashMapOf(
                "review" to reviewText
            )


        }


    }
}



