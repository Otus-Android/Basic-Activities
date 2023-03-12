package ru.otus.android.prokofyev.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import otus.gpb.homework.activities.R

class ActivityC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        Toast.makeText(this, "ActivityC onCreate", Toast.LENGTH_SHORT).show()

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)

        val buttonOpenA = findViewById<Button>(R.id.buttonOpenA)

        buttonOpenA.setOnClickListener {
            val intentA = Intent(this, ActivityA::class.java)
            startActivity(intentA)
        }

        val buttonOpenD = findViewById<Button>(R.id.buttonOpenD)

        buttonOpenD.setOnClickListener {
            val intent = Intent(this, ActivityD::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
            startActivity(intent)
        }

        val buttonCloseC = findViewById<Button>(R.id.buttonCloseC)

        buttonCloseC.setOnClickListener {
            finish()
        }

        val buttonClose = findViewById<Button>(R.id.buttonClose)

        buttonClose.setOnClickListener {
            finishAffinity()
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "ActivityC onDestroy", Toast.LENGTH_SHORT).show()
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Toast.makeText(this, "ActivityC onNewIntent", Toast.LENGTH_SHORT).show()
    }
}