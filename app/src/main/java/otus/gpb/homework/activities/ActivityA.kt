package otus.gpb.homework.activities

import android.content.Intent
import android.content.Intent.FLAG_ACTIVITY_NEW_TASK
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class ActivityA : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Toast.makeText(this, "don't crate new activity A, open on New intent", Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        val button = findViewById<Button>(R.id.buttonActivityB)
        button.setOnClickListener {
            val intent = Intent(applicationContext, ActivityB::class.java)
            intent.addFlags(FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "Close Activity A", Toast.LENGTH_SHORT).show()
    }
}