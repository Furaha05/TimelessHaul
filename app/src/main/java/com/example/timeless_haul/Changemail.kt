package com.example.timeless_haul

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Changemail : AppCompatActivity() {
    lateinit var edtoldmail: EditText
    lateinit var edtnewmail: EditText
    lateinit var edtconfirmmail: EditText
    lateinit var btnchange: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_changemail)


        edtoldmail = findViewById(R.id.edt_oldmail)
        edtnewmail = findViewById(R.id.edt_newmail)
        edtconfirmmail = findViewById(R.id.edt_confirmmail)
        btnchange = findViewById(R.id.btn_change)

        btnchange.setOnClickListener {
            val newEmail = edtnewmail.text.toString()
            updateEmail(newEmail)
        }
    }
    private fun updateEmail(newEmail: String){
        edtnewmail.setText(newEmail)
        val oldmail= edtoldmail.text.toString()

        if (oldmail.isBlank() || btnchange.isPressed){
            Toast.makeText( this, "Error", Toast.LENGTH_LONG).show()
            return
        }else{
            Toast.makeText( this,"Changed", Toast.LENGTH_LONG).show()
            finish()
        }
    }
}