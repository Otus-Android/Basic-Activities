package otus.gpb.homework.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivityB : AppCompatActivity() {
    private lateinit var buttonOpenC:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        buttonOpenC = findViewById(R.id.buttonOpenC)
        buttonOpenC.setOnClickListener() {
            val intent = Intent(this, ActivityC::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()

    }
}