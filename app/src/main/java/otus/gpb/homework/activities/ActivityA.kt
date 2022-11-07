package otus.gpb.homework.activities

import android.app.ActivityManager
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import java.util.*

class ActivityA : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)
        val activityManager = getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
        val recentTasks: List<ActivityManager.RunningTaskInfo> =
            Objects.requireNonNull(activityManager).getRunningTasks(10)
            for (i in recentTasks.indices) {
            Log.d("A", "baseActivity: " + recentTasks[i].baseActivity!!.toShortString())
            Log.d("A", "numActivities: " + recentTasks[i].numActivities.toString())
            Log.d("A", "topActivity: " + recentTasks[i].topActivity!!.toShortString())
        }

        findViewById<Button>(R.id.Open_B).setOnClickListener{
            startActivity(Intent(this, ActivityB::class.java))
        }
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Toast.makeText(this, "onNewIntent A", Toast.LENGTH_LONG).show()
    }
}