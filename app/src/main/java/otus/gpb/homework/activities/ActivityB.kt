package otus.gpb.homework.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class ActivityB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        findViewById<Button>(R.id.activity_b_button).setOnClickListener {
            startActivity(Intent(this, ActivityC::class.java))
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(this::class.java.name, "onDestroy")
    }
}