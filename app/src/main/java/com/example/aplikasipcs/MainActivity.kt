package com.example.aplikasipcs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val button:Button =findViewById(R.id.button)

        button.setOnClickListener {
            val intent = Intent(this, HomeActivity2::class.java )
            startActivity(intent)
        }
        val button2:Button =findViewById(R.id.button2)

        button2.setOnClickListener {
            val intent = Intent(this, HitungActivity::class.java )
            startActivity(intent)
        }
    }
}