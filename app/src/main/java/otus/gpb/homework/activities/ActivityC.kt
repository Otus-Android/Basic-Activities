package otus.gpb.homework.activities

import android.app.ActivityManager
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import java.util.*

class ActivityC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)
        val activityManager = getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
        val recentTasks: List<ActivityManager.RunningTaskInfo> =
            Objects.requireNonNull(activityManager).getRunningTasks(10)
        for (i in recentTasks.indices) {
            Log.d("C", "baseActivity: " + recentTasks[i].baseActivity!!.toShortString())
            Log.d("C", "numActivities: " + recentTasks[i].numActivities.toString())
            Log.d("C", "topActivity: " + recentTasks[i].topActivity!!.toShortString())
        }

        findViewById<Button>(R.id.Open_A).setOnClickListener()
        {
            startActivity(Intent(this, ActivityA::class.java))
        }
        findViewById<Button>(R.id.Open_D).setOnClickListener()
        {
            startActivity(Intent(this, ActivityD::class.java))
            finishAffinity()
        }
        findViewById<Button>(R.id.Close_C).setOnClickListener()
        {
            finish()
        }
        findViewById<Button>(R.id.Close_Stack).setOnClickListener()
        {
            finishAffinity()
        }
    }
}