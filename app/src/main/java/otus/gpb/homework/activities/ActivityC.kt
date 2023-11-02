package otus.gpb.homework.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivityC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)
        findViewById<Button>(R.id.button3).setOnClickListener {
            val intent = Intent(this,ActivityA::class.java)
            startActivity(intent)
        }
        findViewById<Button>(R.id.button4).setOnClickListener {
            val intent = Intent(this,ActivityD::class.java).apply {
                flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
            }
            startActivity(intent)
        }
        findViewById<Button>(R.id.button5).setOnClickListener {
            onBackPressed()
        }
        findViewById<Button>(R.id.button6).setOnClickListener {
            val intent = Intent(this,ActivityA::class.java).apply {
                flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
            }
            startActivity(intent)
        }
    }
}