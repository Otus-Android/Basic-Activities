package otus.gpb.homework.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ActivityC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)

        val openActivityAbtn = findViewById<View>(R.id.open_activity_a_btn)
        val openActivityDbtn = findViewById<View>(R.id.open_activity_d_btn)
        val closeActivityCbtn = findViewById<View>(R.id.close_activity_c_btn)
        val closeStackBtn = findViewById<View>(R.id.close_stack_btn)

        openActivityAbtn.setOnClickListener {
            val intent = Intent(this, ActivityA::class.java)
            startActivity(intent)
        }
        openActivityDbtn.setOnClickListener {
            val intent = Intent(this, ActivityD::class.java).apply {
                addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
            }
            startActivity(intent)
        }
        closeActivityCbtn.setOnClickListener {
            finish()
        }
        closeStackBtn.setOnClickListener {
            finish()
            val intent = Intent(this, ActivityA::class.java).apply {
                addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
            }
            startActivity(intent)
        }
    }
}