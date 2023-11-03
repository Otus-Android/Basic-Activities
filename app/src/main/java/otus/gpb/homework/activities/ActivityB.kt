package otus.gpb.homework.activities

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ActivityB : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val openActivityCButton = findViewById<Button>(R.id.btn_activity_b)
        openActivityCButton.setOnClickListener {
            // Обработка нажатия на кнопку "Open ActivityC"
        }
    }



}