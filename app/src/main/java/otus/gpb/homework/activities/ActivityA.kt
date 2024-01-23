package otus.gpb.homework.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ActivityA : AppCompatActivity() {
    private lateinit var buttonOpenB: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)

        buttonOpenB = findViewById(R.id.buttonOpenB)
    }

    override fun onStart() {
        super.onStart()
        buttonOpenB.setOnClickListener() {
            val intent = Intent(this, ActivityB::class.java).apply{
                flags = Intent.FLAG_ACTIVITY_NEW_TASK
            }
            startActivity(intent)
        }
    }
}