package otus.gpb.homework.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class ActivityA : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)

        findViewById<Button>(R.id.activity_a_button).setOnClickListener {
            startActivity(Intent(this, ActivityB::class.java))
        }
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.d(this::class.java.name, "onNewIntent")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(this::class.java.name, "onDestroy")
    }
}