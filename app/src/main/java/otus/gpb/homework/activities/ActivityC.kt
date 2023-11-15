package otus.gpb.homework.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

private const val TAG = "ActivityC"

class ActivityC : AppCompatActivity(R.layout.activity_c) {

    lateinit var buttonA: Button
    lateinit var buttonD: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        buttonA = findViewById(R.id.mainActivityA)
        buttonD = findViewById(R.id.mainActivityD)
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "call onStart")
        buttonA.setOnClickListener {
            Log.d(TAG, "button clicked")

        }
        findViewById<Button>(R.id.mainActivityD).setOnClickListener {

        }
    }
}