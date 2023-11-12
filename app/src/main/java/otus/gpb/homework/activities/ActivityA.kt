package otus.gpb.homework.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class ActivityA : AppCompatActivity(R.layout.activity_activitya) {
    override fun onStart(){
        super.onStart()
        findViewById<Button>(R.id.buttonOnA).setOnClickListener {
            val intent= Intent(this, ActivityB::class.java)
            intent.flags= Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_MULTIPLE_TASK
            startActivity(intent)
        }
    }
    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
    }

}