package otus.gpb.homework.activities

import android.content.Intent
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ActivityC : AppCompatActivity(R.layout.activity_c) {

    override fun onStart() {
        super.onStart()
        Log.d(this::class.simpleName, "Started in stack $taskId")
        findViewById<Button>(R.id.openActivityDButton).setOnClickListener {
            val intent = Intent(this, ActivityD::class.java)
            finishAffinity()
            startActivity(intent)
        }
        findViewById<Button>(R.id.openActivityAButton).setOnClickListener {
            val intent = Intent(this, ActivityA::class.java)
            startActivity(intent)
        }
        findViewById<Button>(R.id.closeActivityCButton).setOnClickListener {
            finish()
        }
        findViewById<Button>(R.id.closeStackButton).setOnClickListener {
            val intent = Intent(this, ActivityA::class.java)
            finishAffinity()
            startActivity(intent)
        }
    }
}