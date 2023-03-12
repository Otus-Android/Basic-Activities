package ru.otus.android.prokofyev.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import otus.gpb.homework.activities.R

class ActivityC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)

        val buttonOpenA = findViewById<Button>(R.id.buttonOpenA)

        buttonOpenA.transformationMethod = null
        buttonOpenA.setOnClickListener {
            val intentA = Intent(applicationContext, ActivityA::class.java)
            startActivity(intentA)
        }


        val buttonOpenD = findViewById<Button>(R.id.buttonOpenD)

        buttonOpenD.transformationMethod = null
        buttonOpenD.setOnClickListener {
            val intentD = Intent(applicationContext, ActivityD::class.java)
            startActivity(intentD)
        }


        val buttonCloseC = findViewById<Button>(R.id.buttonCloseC)

        buttonCloseC.transformationMethod = null
        buttonCloseC.setOnClickListener {
            val intentD = Intent(applicationContext, ActivityD::class.java)
            startActivity(intentD)
        }

        val buttonClose = findViewById<Button>(R.id.buttonClose)

        buttonClose.transformationMethod = null
        buttonClose.setOnClickListener {
            val intentD = Intent(applicationContext, ActivityD::class.java)
            startActivity(intentD)
        }



    }
}