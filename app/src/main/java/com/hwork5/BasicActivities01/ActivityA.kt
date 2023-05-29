package com.hwork5.BasicActivities01

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import otus.gpb.homework.activities.R

class ActivityA : AppCompatActivity() {

    private val button by lazy {findViewById<Button>(R.id.but)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)

        button.setOnClickListener{
            val intent = Intent(this, ActivityB::class.java)
           // intent.addFlags(Intent.FLAG_ACTIVITY_MULTIPLE_TASK)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
        }
    }

    override fun onNewIntent(intent: Intent?) {
        Log.e("ActivityA", "openActivityA")
        super.onNewIntent(intent)
    }

    override fun onDestroy() {
        Log.e("ActivityA","DestroyActivityA")
        super.onDestroy()
    }
}