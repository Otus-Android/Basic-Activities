package otus.gpb.homework.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivityB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        val openc = findViewById<Button>(R.id.open_c)

        openc.setOnClickListener {

            val intent = Intent(this, ActivityC::class.java)

            startActivity(intent)
        }
    }


}