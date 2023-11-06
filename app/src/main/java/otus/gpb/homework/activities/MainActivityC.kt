package otus.gpb.homework.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivityC : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_c)

        val button = findViewById<Button>(R.id.button_open_activity_A_from_C)
        val button2 = findViewById<Button>(R.id.button_open_activity_D_from_C)
        val button3 = findViewById<Button>(R.id.button_close_activity_C_from_C)
        val button4 = findViewById<Button>(R.id.button_close_Stacks)

        button.setOnClickListener {
            val intent = Intent(this, MainActivityA::class.java)
            startActivity(intent)
        }

        button2.setOnClickListener {
            val intent = Intent(this, MainActivityD::class.java).apply {
                flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            }
            startActivity(intent)
        }

        button3.setOnClickListener {
            finish()
        }

        button4.setOnClickListener {
            finishAffinity()
        }
    }

}