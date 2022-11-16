package com.example.activitybasic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivityC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)

        val btActAfromC = findViewById<Button>(R.id.opActivityA_fromC)

        btActAfromC.setOnClickListener {
            val intent = Intent(this, ActivityA::class.java)
            startActivity(intent)
        }

        val btActDfromC = findViewById<Button>(R.id.opActivityD_fromC)

        btActDfromC.setOnClickListener {
            val intent = Intent(this,ActivityD::class.java)
            finishAffinity()
            startActivity(intent)
        }

        val btclActC = findViewById<Button>(R.id.clActivityC)

        btclActC.setOnClickListener {
            val intent = Intent(this, ActivityB::class.java)
            startActivity(intent)
        }

        val btclstack = findViewById<Button>(R.id.close_stack)

        btclstack.setOnClickListener {
            finishAffinity()
        }

    }
}