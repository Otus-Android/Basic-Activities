package com.andreirookie.ots_basic_activities

import android.content.Intent
import android.content.Intent.*
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ActivityC : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)

        val buttonToOpenActivityA =findViewById<Button>(R.id.toOpenActivityA)
        val buttonToOpenActivityD =findViewById<Button>(R.id.toOpenActivityD)
        val buttonToCloseActivityC =findViewById<Button>(R.id.toCloseActivityC)
        val buttonToCloseStack =findViewById<Button>(R.id.toCloseStack)

        buttonToOpenActivityA.setOnClickListener {
            val intent = Intent(this, ActivityA::class.java)
            startActivity(intent)
        }

        buttonToOpenActivityD.setOnClickListener {
            val intent = Intent(this, ActivityD::class.java)
            intent.setFlags(FLAG_ACTIVITY_CLEAR_TASK | FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
        }

        buttonToCloseActivityC.setOnClickListener {
            finish()
        }

        buttonToCloseStack.setOnClickListener {
            finishAffinity()
        }
    }
}