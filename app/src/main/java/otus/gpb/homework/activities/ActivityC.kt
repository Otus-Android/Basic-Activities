package otus.gpb.homework.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ActivityC : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)


        val openActivityAButton = findViewById<Button>(R.id.btn_activity_c_open_a)
        openActivityAButton.setOnClickListener {
            // Обработка нажатия на кнопку "Open ActivityA"

                val intent = Intent(this, ActivityA::class.java)
                intent.flags = Intent.FLAG_ACTIVITY_SINGLE_TOP
                startActivity(intent)

        }

        val openActivityDButton = findViewById<Button>(R.id.btn_activity_c_open_d)
        openActivityDButton.setOnClickListener {
            // Обработка нажатия на кнопку "Open ActivityD"

                val intent = Intent(this, ActivityD::class.java)
                intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
                startActivity(intent)
            }



        val closeActivityCButton = findViewById<Button>(R.id.btn_activity_c_close_c)
        closeActivityCButton.setOnClickListener {
            // Обработка нажатия на кнопку "Close ActivityC"
            finish()
        }

        val closeStackButton = findViewById<Button>(R.id.btn_activity_c_close_stack)
        closeStackButton.setOnClickListener {
            // Обработка нажатия на кнопку "Close Stack"
            val intent = Intent(this, ActivityA::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
        }
    }



}