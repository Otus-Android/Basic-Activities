package otus.gpb.homework.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ActivityB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        val openActivityCbtn = findViewById<View>(R.id.button_activity_b)

        openActivityCbtn.setOnClickListener {
            startActivity(Intent(this, ActivityC::class.java))
        }
    }
}