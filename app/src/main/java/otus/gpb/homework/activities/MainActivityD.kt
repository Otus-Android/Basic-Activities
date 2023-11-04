package otus.gpb.homework.activities

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivityD : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_d)
    }

    override fun onStart() {
        super.onStart()

        val button = findViewById<Button>(R.id.button_clear_D)

        button.setOnClickListener {
            finishAffinity()
        }

    }
}