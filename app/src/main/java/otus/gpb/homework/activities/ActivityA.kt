package otus.gpb.homework.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ActivityA : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)

        val openActivityBButton = findViewById<Button>(R.id.btn_activity_a)
        openActivityBButton.setOnClickListener {
            // Обработка нажатия на кнопку "Open ActivityB"
            val intent = Intent(this, ActivityB::class.java)
            //intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
        }
    }

    override fun onNewIntent(intent: Intent?) {
        Log.w("ActivityA", "call new intent activityA")
        super.onNewIntent(intent)

    }
}