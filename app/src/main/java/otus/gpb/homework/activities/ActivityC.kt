package otus.gpb.homework.activities

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ActivityC : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val openActivityAButton = findViewById<Button>(R.id.btn_activity_c_open_a)
        openActivityAButton.setOnClickListener {
            // Обработка нажатия на кнопку "Open ActivityA"
        }

        val openActivityDButton = findViewById<Button>(R.id.btn_activity_c_open_d)
        openActivityDButton.setOnClickListener {
            // Обработка нажатия на кнопку "Open ActivityD"
        }

        val closeActivityCButton = findViewById<Button>(R.id.btn_activity_c_close_c)
        closeActivityCButton.setOnClickListener {
            // Обработка нажатия на кнопку "Close ActivityC"
        }

        val closeStackButton = findViewById<Button>(R.id.btn_activity_c_close_stack)
        closeStackButton.setOnClickListener {
            // Обработка нажатия на кнопку "Close Stack"
        }
    }



}