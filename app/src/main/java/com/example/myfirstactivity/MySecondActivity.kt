package com.example.myfirstactivity

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MySecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_second)
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this,"Pasó el segundo Activity", Toast.LENGTH_LONG).show()
    }
}