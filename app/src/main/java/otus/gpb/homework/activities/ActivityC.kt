package otus.gpb.homework.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivityC : AppCompatActivity() {

    private lateinit var btnOpenA: Button
    private lateinit var btnOpenD: Button
    private lateinit var btnCloseActivity: Button
    private lateinit var btnCloseStack: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)

        btnOpenA = findViewById(R.id.btn_open_a)
        btnOpenD = findViewById(R.id.btn_open_d)
        btnCloseActivity = findViewById(R.id.btn_close_activity)
        btnCloseStack = findViewById(R.id.btn_close_stack)

        btnOpenA.setOnClickListener {
            val intent = Intent(this, ActivityA::class.java)
            startActivity(intent)
        }

        btnOpenD.setOnClickListener {
            val intent = Intent(this, ActivityD::class.java)
            finishAffinity()
            startActivity(intent)
        }

        btnCloseActivity.setOnClickListener {
            finish()
        }

        btnCloseStack.setOnClickListener {
            finishAffinity()
        }
    }
}
