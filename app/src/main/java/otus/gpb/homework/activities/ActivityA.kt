package otus.gpb.homework.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class ActivityA : AppCompatActivity(R.layout.activity_a) {

    override fun onStart() {
        super.onStart()
        Log.d(this::class.simpleName, "Started in stack $taskId")
        findViewById<Button>(R.id.openActivityBButton).setOnClickListener {
            val intent = Intent(this, ActivityB::class.java).apply {
                flags = Intent.FLAG_ACTIVITY_MULTIPLE_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
            }
            startActivity(intent)
        }
    }

    override fun onNewIntent(intent: Intent?) {
        Log.d(this::class.simpleName, "onNewIntent called")
        super.onNewIntent(intent)
    }
}