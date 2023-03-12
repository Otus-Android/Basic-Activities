package ru.otus.android.prokofyev.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import otus.gpb.homework.activities.R

class ActivityB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        Toast.makeText(applicationContext, "ActivityB onCreate", Toast.LENGTH_SHORT).show()

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        val buttonOpenC = findViewById<Button>(R.id.buttonOpenC)

        buttonOpenC.setOnClickListener {
            val intentC = Intent(applicationContext, ActivityC::class.java)
            startActivity(intentC)
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "ActivityB onDestroy", Toast.LENGTH_SHORT).show()
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Toast.makeText(this, "ActivityB onNewIntent", Toast.LENGTH_SHORT).show()
    }
}