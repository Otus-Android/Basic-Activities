package otus.gpb.homework.activities

import android.app.ActivityManager
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.util.*

class ActivityD : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_d)
        val activityManager = getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
        val recentTasks: List<ActivityManager.RunningTaskInfo> =
            Objects.requireNonNull(activityManager).getRunningTasks(10)
        for (i in recentTasks.indices) {
            Log.d("DI", "Open_D: baseActivity: " + recentTasks[i].baseActivity!!.toShortString())
            Log.d("DI", "Open_D: numActivities: " + recentTasks[i].numActivities.toString())
            Log.d("DI", "Open_D: topActivity: " + recentTasks[i].topActivity!!.toShortString())
        }
    }
    /*
    override fun onBackPressed() {
    Toast.makeText(this, "onBackPressed D", Toast.LENGTH_LONG).show()
    val intent = Intent(this, ActivityA::class.java)
    startActivity(intent)
    }

     */
}