package otus.gpb.homework.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

private const val TAG = "onNewIntent"

class MainActivityA : AppCompatActivity(R.layout.activity_main_a) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val button = findViewById<Button>(R.id.button_activity_B)
        button.setOnClickListener {
            val intent = Intent(this, MainActivityB::class.java).apply {
                flags = Intent.FLAG_ACTIVITY_NEW_TASK
            }
            startActivity(intent)
        }
    }

    override fun onNewIntent(intent: Intent?) {
        Log.d(TAG,"call newIntent activity A")
        super.onNewIntent(intent)
    }
}