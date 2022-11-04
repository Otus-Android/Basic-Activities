package otus.gpb.homework.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivityC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)

        findViewById<Button>(R.id.open_a_button).setOnClickListener {
            startActivity(Intent(this, ActivityA::class.java))
        }
        findViewById<Button>(R.id.open_d_button).setOnClickListener {
            val intent = Intent(this, ActivityD::class.java)
            startActivity(intent.apply {
                flags = Intent.FLAG_ACTIVITY_CLEAR_TASK
            })
        }
        findViewById<Button>(R.id.close_c_button).setOnClickListener {
            finish()
        }
        findViewById<Button>(R.id.close_stack_button).setOnClickListener {
            finishAffinity()
            startActivity(Intent(this, ActivityA::class.java))
        }
    }
}