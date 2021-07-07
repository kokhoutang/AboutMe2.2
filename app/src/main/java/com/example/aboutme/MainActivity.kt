package com.example.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
          val btnDone: Button = findViewById(R.id.done_button)
        
        btnDone.setOnClickListener(){

            val tvInput: TextView = findViewById(R.id.nickname_edit)
            val tvResult: TextView = findViewById(R.id.nickname_text)
            tvResult.text = tvInput.text
            tvResult.visibility = View.VISIBLE
            btnDone.visibility = View.GONE
            tvInput.visibility = View.GONE
        }
    }
}
