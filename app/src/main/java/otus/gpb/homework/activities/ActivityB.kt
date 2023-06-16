package otus.gpb.homework.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class ActivityB : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activity_b)
        val button = findViewById<Button>(R.id.buttonSecondActivityB)
        button.setOnClickListener {
            val intent = Intent(applicationContext, ActivityC::class.java)
            startActivity(intent)
        }
    }
}