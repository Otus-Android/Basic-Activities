package otus.gpb.homework.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class ActivityB : AppCompatActivity(R.layout.activity_b) {

    override fun onStart() {
        super.onStart()
        Log.d(this::class.simpleName, "Started in stack $taskId")
        findViewById<Button>(R.id.openActivityCButton).setOnClickListener {
            val intent = Intent(this, ActivityC::class.java)
            startActivity(intent)
        }
    }
}