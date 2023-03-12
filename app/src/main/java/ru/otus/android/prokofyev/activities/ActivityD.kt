package ru.otus.android.prokofyev.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import otus.gpb.homework.activities.R

class ActivityD : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Toast.makeText(this, "ActivityD onCreate", Toast.LENGTH_SHORT).show()

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_d)
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "ActivityD onDestroy", Toast.LENGTH_SHORT).show()
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Toast.makeText(this, "ActivityD onNewIntent", Toast.LENGTH_SHORT).show()
    }
}