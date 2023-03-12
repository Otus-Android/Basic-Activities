package ru.otus.android.prokofyev.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import otus.gpb.homework.activities.R

class ActivityA : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        Toast.makeText(this, "ActivityA onCreate", Toast.LENGTH_LONG).show()

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)
        val buttonOpenB = findViewById<Button>(R.id.buttonOpenB)
        buttonOpenB.transformationMethod = null
        buttonOpenB.setOnClickListener {
            val intentB = Intent(applicationContext, ActivityB::class.java)
            startActivity(intentB)
        }
    }
}
