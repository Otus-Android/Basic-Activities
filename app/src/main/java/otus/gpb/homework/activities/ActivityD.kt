package otus.gpb.homework.activities

import android.app.ActivityManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ActivityD : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_d)
    }

    override fun onStart() {
        super.onStart()
        sendLogs(localClassName,"onStart")

        title = resources.getString(R.string.app_name) + " : " + localClassName
        sendLogs(localClassName, am = getSystemService(ACTIVITY_SERVICE) as ActivityManager)
    }

    override fun onDestroy() {
        super.onDestroy()
        sendLogs(localClassName,"onDestroy")
    }
}