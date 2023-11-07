package otus.gpb.homework.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivityB : AppCompatActivity(R.layout.activity_b) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        super.onStart()

        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            val intent = Intent(this, ActivityC::class.java)

            startActivity(intent)
        }
    }

}