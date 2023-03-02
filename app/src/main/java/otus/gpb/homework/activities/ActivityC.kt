package otus.gpb.homework.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class ActivityC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)

        findViewById<Button>(R.id.activity_c_button_open_a).setOnClickListener {
            startActivity(Intent(this, ActivityA::class.java))
        }
        findViewById<Button>(R.id.activity_c_button_open_d).setOnClickListener {
            startActivity(Intent(this, ActivityD::class.java))
            finishAffinity()
        }
        findViewById<Button>(R.id.activity_c_button_close_c).setOnClickListener {
            finish()
        }
        findViewById<Button>(R.id.activity_c_button_close).setOnClickListener {
            finishAffinity()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(this::class.java.name, "onDestroy")
    }
}