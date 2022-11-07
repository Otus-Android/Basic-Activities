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

class ActivityB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)
        val activityManager = getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
        val recentTasks: List<ActivityManager.RunningTaskInfo> =
            Objects.requireNonNull(activityManager).getRunningTasks(10)
        for (i in recentTasks.indices) {
            Log.d("B", "baseActivity: " + recentTasks[i].baseActivity!!.toShortString())
            Log.d("B", "numActivities: " + recentTasks[i].numActivities.toString())
            Log.d("B", "topActivity: " + recentTasks[i].topActivity!!.toShortString())
        }
        findViewById<Button>(R.id.Open_C).setOnClickListener(){
            startActivity(Intent(this, ActivityC::class.java))
        }
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Toast.makeText(this, "onNewIntent B", Toast.LENGTH_LONG).show()
    }
}