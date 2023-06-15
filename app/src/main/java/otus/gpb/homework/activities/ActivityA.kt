package otus.gpb.homework.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.Button
import android.widget.Toast

class ActivityA : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activity)
    }
    override fun onStart() {
        super.onStart()
        val button = findViewById<Button>(R.id.buttonSecondActivity)
        button.setOnClickListener {
            val intent = Intent(applicationContext, ActivityB::class.java)
            startActivity(intent)
        }
    }
    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Toast.makeText(this, "onNewIntent", Toast.LENGTH_SHORT).show()
    }
}