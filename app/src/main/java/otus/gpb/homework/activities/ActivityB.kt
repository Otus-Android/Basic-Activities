package otus.gpb.homework.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivityB : AppCompatActivity(R.layout.activity_b) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        findViewById<Button>(R.id.open_activity_c_btn).setOnClickListener { runActivityC() }
    }

    private fun runActivityC() {
        val intent = Intent(this, ActivityC::class.java)
        startActivity(intent)
    }
}