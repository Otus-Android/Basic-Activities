package otus.gpb.homework.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

private const val TAG = "MainActivityC"

lateinit var buttonB: Button

class ActivityB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)
        buttonB = findViewById<Button>(R.id.openActivityC)


        buttonB.setOnClickListener {
            val intent = Intent(this, ActivityC::class.java)
            startActivity(intent)
            Log.d(TAG,"call onCreate")
        }
    }
}
