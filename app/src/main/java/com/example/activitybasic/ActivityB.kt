package com.example.activitybasic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivityB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        val buttonActC = findViewById<Button>(R.id.opActivityC)

        buttonActC.setOnClickListener {
            val intent = Intent (this, ActivityC::class.java)
            startActivity(intent)
        }
    }
}