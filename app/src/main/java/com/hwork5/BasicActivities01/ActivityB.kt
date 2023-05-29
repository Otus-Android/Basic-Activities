package com.hwork5.BasicActivities01

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import otus.gpb.homework.activities.R

class ActivityB : AppCompatActivity() {
    private val button by lazy {findViewById<Button>(R.id.openActivityC)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        button.setOnClickListener{
            val intent = Intent(this, ActivityC::class.java)
            startActivity(intent)
        }

    }

    override fun onDestroy() {
        Log.e("ActivityB", "DestroyActivityB")
        super.onDestroy()
    }
}