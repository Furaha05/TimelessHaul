package com.example.timeless_haul

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.google.firebase.database.FirebaseDatabase

class SellersActivity : AppCompatActivity() {
    private val REQUEST_CODE_PERMISSION= 123
    private val REQUEST_CODE_GALLERY = 456
    lateinit var btnsubmit: Button
    lateinit var edtdesc: EditText
    lateinit var edtnumber: EditText
    private lateinit var database: FirebaseDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sellers)
        btnsubmit=findViewById(R.id.btnSUBMIT)
        edtdesc=findViewById(R.id.edtdecription)
        edtnumber=findViewById(R.id.edtnumber)

        database = FirebaseDatabase.getInstance()

        btnsubmit.setOnClickListener {
            val name =edtdesc .text.toString()
            saveDataToFirebase(name)
            val number =edtnumber.text.toString()
            saveDataToFirebase(name)

        }


        val selectImageButton: ImageButton = findViewById(R.id.imagebtnupload)
        selectImageButton.setOnClickListener {
            if (isStoragePermissionGranted()) {
                openGallery()
            }
        }


    }

    private fun isStoragePermissionGranted(): Boolean {
        if (ContextCompat.checkSelfPermission(
                this,
                Manifest.permission.READ_EXTERNAL_STORAGE
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE),
                REQUEST_CODE_PERMISSION
            )
            return false
        }
        return true
    }

    private fun openGallery() {
        val intent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
        @Suppress("DEPRECATION")
        startActivityForResult(intent, REQUEST_CODE_GALLERY)
    }


    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == REQUEST_CODE_PERMISSION) {
            if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                openGallery()
            } else {
                Toast.makeText(
                    this,
                    "Gallery permission denied",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }

    @Deprecated("Deprecated in Java")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        @Suppress("DEPRECATION")
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_CODE_GALLERY && resultCode == RESULT_OK) {
            data?.data
            // Perform the upload logic with the selected image URI
            // You can use the selectedImage URI to upload the image to your server or perform any other desired operation
            // For example, you can use a library like Retrofit to handle the upload process
            // Here's an example of how you can display the selected image using an ImageView:
            // val imageView: ImageView = findViewById(R.id.imageView)
            // imageView.setImageURI(selectedImage)
        }
    }
    private fun saveDataToFirebase(name: String) {
        val reference = database.reference.child("users")
        val user = reference.push()
        user.child("name").setValue(name)
        // You can add more data fields here using the same format
    }
}

