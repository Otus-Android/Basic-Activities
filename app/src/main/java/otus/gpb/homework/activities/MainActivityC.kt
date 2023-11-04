package otus.gpb.homework.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivityC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_c)
    }

    override fun onStart() {
        super.onStart()

        val button = findViewById<Button>(R.id.button_activity_D)
        val button2 = findViewById<Button>(R.id.button_close_activity_C)

        button.setOnClickListener {
            val intent = Intent(this, MainActivityD::class.java).apply {
                flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
            }
            startActivity(intent)
        }


        button2.setOnClickListener {
            val intent = Intent(this,MainActivityB::class.java).apply {
                flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
            }

            startActivity(intent)
        }
    }
}