package otus.gpb.homework.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button


private const val TAG = "ActivityA"

class ActivityA : AppCompatActivity(R.layout.activity_a) {

    lateinit var buttonB: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "call onCreate")

        buttonB = findViewById(R.id.mainActivityB)
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "call onStart")
        buttonB.setOnClickListener {
            Log.d(TAG, "button clicked")
            val intent = Intent(this, ActivityB::class.java).apply {
                flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
            }
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "call onResume")
    }

    override fun onStop() {
        Log.d(TAG, "call onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(TAG, "call onDestroy")
        super.onDestroy()
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "call onRestart")
    }

    override fun onBackPressed() {
        Log.d(TAG, "call onBackPressed")
        super.onBackPressed()
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.d(TAG, "call onNewIntent")
    }
}


