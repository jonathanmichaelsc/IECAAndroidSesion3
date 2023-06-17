package com.example.myfirstactivity

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextSwitcher
import android.widget.TextView
import android.widget.Toast

class MyFirstActivity : Activity() {

    lateinit var vista_contador:TextView
    lateinit var btn_contador:Button
    var contador = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_my_first)

        vista_contador = findViewById(R.id.vista_contador)
        btn_contador = findViewById(R.id.btn_contador)

        btn_contador.setOnClickListener{
            contador++
                    vista_contador.text = contador.toString()
            Toast.makeText(this,contador.toString(),Toast.LENGTH_LONG).show()
        }
    }

    override fun onResume() {
        super.onResume()

/*
Toast.makeText(this,"Hola bebé", Toast.LENGTH_LONG).show()

val intent = Intent(Intent.ACTION_VIEW)
intent.data = Uri.parse("https://www.google.com/")
startActivity(intent)
*/

/*
val intent = Intent(this,MySecondActivity::class.java)
startActivity(intent)
*/
    }
}

