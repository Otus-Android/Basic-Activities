package otus.gpb.homework.activities

import android.app.ActivityManager
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

fun sendLogs(activity: String, status: String = "task", am: ActivityManager? = null) {

    if (status == "task") {
        am?.getRunningTasks(10)?.forEach{
            if (it.baseActivity?.flattenToShortString()?.startsWith("otus.gpb.homework") == true) {
                Log.d("LOG_TAG", "------------------")
                Log.d("LOG_TAG", "Count: " + it.numActivities)
                Log.d("LOG_TAG", "Root: " + (it.baseActivity?.flattenToShortString() ?: ""))
                Log.d("LOG_TAG", "Top: " + (it.topActivity?.flattenToShortString() ?: ""))
            }
        }
    } else {
        Log.d("LOG_TAG", "---------//$status $activity//---------")
    }


}
class ActivityA : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)
    }

    override fun onStart() {
        super.onStart()
        sendLogs(localClassName,"onStart")

        val button = findViewById<Button>(R.id.openActivityB)
        button.setOnClickListener {
            val intent = Intent(this, ActivityB::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_MULTIPLE_TASK
            startActivity(intent)
        }
        title = resources.getString(R.string.app_name) + " : " + localClassName
        sendLogs(localClassName, am = getSystemService(ACTIVITY_SERVICE) as ActivityManager)
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        sendLogs(localClassName,"onNewIntent")
    }

    override fun onDestroy() {
        super.onDestroy()
        sendLogs(localClassName,"onDestroy")
    }
}