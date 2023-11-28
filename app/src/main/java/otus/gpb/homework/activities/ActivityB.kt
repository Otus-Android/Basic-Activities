package otus.gpb.homework.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

private const val TAG = "ActivityB"

class ActivityB : AppCompatActivity(R.layout.activity_b) {

    lateinit var buttonC: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        findViewById<Button?>(R.id.mainActivityC).setOnClickListener {
            val intent = Intent(this, ActivityC::class.java)
            startActivity(intent)
        }

    }
}