package com.hwork5.BasicActivities01

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import otus.gpb.homework.activities.R

class ActivityC : AppCompatActivity() {

    private val openActivityABut by lazy {findViewById<Button>(R.id.openActivityA)}
    private val openActivityDBut by lazy {findViewById<Button>(R.id.openActivityD)}
    private val closeActivityCBut by lazy {findViewById<Button>(R.id.closeActivityC)}
    private val closeStackBut by lazy {findViewById<Button>(R.id.closeStack)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)

        openActivityABut.setOnClickListener{
            val intent = Intent(this, ActivityA::class.java)
            startActivity(intent)
        }

        openActivityDBut.setOnClickListener{
            val intent = Intent(this, ActivityD::class.java)
            intent.apply {
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                startActivity(intent)
            }
            startActivity(intent)
        }

        closeActivityCBut.setOnClickListener{
            finish()
        }

        closeStackBut.setOnClickListener{
            val intent = Intent(this, ActivityA::class.java)
            finishAffinity()
            startActivity(intent)
        }

    }

    override fun onDestroy() {
        Log.e("ActivityC","DestroyActivityC")
        super.onDestroy()
    }
}