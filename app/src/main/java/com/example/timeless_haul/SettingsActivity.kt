package com.example.timeless_haul

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class SettingsActivity : AppCompatActivity() {
    lateinit var btnchangemail: Button
    lateinit var btndel: Button
    lateinit var btnlogout: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        btnchangemail = findViewById(R.id.btnChangemail)
        btndel = findViewById(R.id.btnDeleteAccount)
        btnlogout = findViewById(R.id.btnLogout)
        FirebaseAuth.getInstance().signOut()


        btnchangemail.setOnClickListener{
            val intent = Intent( this, Changemail::class.java)
            startActivity(intent)
        }
        btnlogout.setOnClickListener {
            FirebaseAuth.getInstance().signOut()
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }

        btndel.setOnClickListener {
            val intent= Intent( this, MainActivity::class.java)
            startActivity(intent)
        }

        if (btndel.isPressed){
            Toast.makeText( this,"Account Deleted!" , Toast.LENGTH_LONG).show()
            finish()
        }
        if (btnlogout.isPressed){
            Toast.makeText( this, "Logged out", Toast.LENGTH_LONG).show()
            finish()

        }

    }
}