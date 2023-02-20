package otus.gpb.homework.activities

import android.content.Intent
import android.content.Intent.FLAG_ACTIVITY_CLEAR_TASK
import android.content.Intent.FLAG_ACTIVITY_NEW_TASK
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivityC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)
        val buttonc1 =findViewById<Button>(R.id.button_c1)
        val buttonc2 =findViewById<Button>(R.id.button_c2)
        val buttonc3 =findViewById<Button>(R.id.button_c3)
        val buttonc4 =findViewById<Button>(R.id.button_c4)
        buttonc1.setOnClickListener {
            val intent = Intent(this, ActivityA::class.java)
            startActivity(intent)
        }
        buttonc2.setOnClickListener {
            val intent = Intent(this, ActivityD::class.java)
            intent
                .addFlags(FLAG_ACTIVITY_CLEAR_TASK and FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
        }
        buttonc3.setOnClickListener { finish() }
        buttonc4.setOnClickListener { finishAffinity() }
    }
}