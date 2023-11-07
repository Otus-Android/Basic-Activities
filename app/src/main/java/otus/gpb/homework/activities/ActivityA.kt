package otus.gpb.homework.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

const val TAG_A = "ACTIVITY_A"

class ActivityA : AppCompatActivity(R.layout.activity_a) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        super.onStart()

        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            val intent = Intent(this, ActivityB::class.java).apply {
                flags = Intent.FLAG_ACTIVITY_MULTIPLE_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
            }

            startActivity(intent)
        }
    }

    override fun onNewIntent(intent: Intent?) {

        Log.d(TAG_A, "onNewIntent activity A")
        super.onNewIntent(intent)
    }
}