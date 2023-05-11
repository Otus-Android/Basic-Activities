package otus.gpb.homework.activities

import android.app.ActivityManager
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivityB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)
    }

    override fun onStart() {
        super.onStart()
        sendLogs(localClassName,"onStart")

        val button = findViewById<Button>(R.id.openActivityC)
        button.setOnClickListener {
            val intent = Intent(this, ActivityC::class.java)
            startActivity(intent)
        }
        title = resources.getString(R.string.app_name) + " : " + localClassName
        sendLogs(localClassName, am = getSystemService(ACTIVITY_SERVICE) as ActivityManager)
    }

    override fun onDestroy() {
        super.onDestroy()
        sendLogs(localClassName,"onDestroy")
    }

}