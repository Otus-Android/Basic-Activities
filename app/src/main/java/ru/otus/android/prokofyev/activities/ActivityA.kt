package ru.otus.android.prokofyev.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import otus.gpb.homework.activities.R

class ActivityA : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        Toast.makeText(this, "ActivityA onCreate", Toast.LENGTH_SHORT).show()

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)
        val buttonOpenB = findViewById<Button>(R.id.buttonOpenB)

        buttonOpenB.setOnClickListener {
            val intentB = Intent(applicationContext, ActivityB::class.java)
            startActivity(intentB)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "ActivityA onDestroy", Toast.LENGTH_SHORT).show()
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Toast.makeText(this, "ActivityA onNewIntent", Toast.LENGTH_SHORT).show()
    }
}
