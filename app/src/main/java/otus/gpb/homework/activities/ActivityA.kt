package otus.gpb.homework.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button


lateinit var button: Button
private const val TAG = "MainActivity"
class ActivityA : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activity)
        button = findViewById<Button>(R.id.openActivityB)
        Log.d(TAG,"call onCreate")
    }

    override fun onStart() {
        super.onStart()
        button.setOnClickListener {
            val intent = Intent(this, ActivityB::class.java)
            startActivity(intent)
            Log.d(TAG,"call onStart")


        }
    }
}
