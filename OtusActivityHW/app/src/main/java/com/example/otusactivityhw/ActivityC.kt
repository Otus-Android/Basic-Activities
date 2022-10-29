package com.example.otusactivityhw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivityC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)

        findViewById<Button>(R.id.openActivityAButton).setOnClickListener {
        }

        findViewById<Button>(R.id.openActivityDButton).setOnClickListener {
        }

        findViewById<Button>(R.id.closeActivityCButton).setOnClickListener {
        }

        findViewById<Button>(R.id.closeStackButton).setOnClickListener {
        }
    }
}