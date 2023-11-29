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
    lateinit var buttonC: Button
    lateinit var buttonS: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        buttonA = findViewById(R.id.mainActivityA)
        buttonD = findViewById(R.id.mainActivityD)
        buttonC = findViewById(R.id.mainActivityC)
        buttonS = findViewById(R.id.closeStack)
    }


    override fun onStart() {
        super.onStart()
        Log.d(TAG, "call onStart")
        buttonA.setOnClickListener {
            Log.d(TAG, "button clicked")
            val intent = Intent(this, ActivityA::class.java)
            startActivity(intent)
        }
        findViewById<Button>(R.id.mainActivityD).setOnClickListener {
            val intent = Intent(this, ActivityD::class.java).apply {
                flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
            }

            startActivity(intent)
        }
        buttonC.setOnClickListener {
            finish()
        }
        buttonS.setOnClickListener {
            finishAffinity()
        }
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.d(TAG, "button onNewIntent")
    }
}