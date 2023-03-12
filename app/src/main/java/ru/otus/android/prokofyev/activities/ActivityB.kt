package ru.otus.android.prokofyev.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import otus.gpb.homework.activities.R

class ActivityB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        Toast.makeText(applicationContext, "ActivityB onCreate", Toast.LENGTH_LONG).show()

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        val buttonOpenC = findViewById<Button>(R.id.buttonOpenC)

        buttonOpenC.transformationMethod = null
        buttonOpenC.setOnClickListener {
            val intentC = Intent(applicationContext, ActivityC::class.java)
            startActivity(intentC)
        }

    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)

        Toast.makeText(applicationContext, "ActivityB onNewIntent", Toast.LENGTH_LONG).show()
    }
}