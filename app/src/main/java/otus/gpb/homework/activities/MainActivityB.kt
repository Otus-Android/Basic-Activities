package otus.gpb.homework.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivityB : AppCompatActivity(R.layout.activity_main_b) {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_b)
    }

    override fun onStart() {
        super.onStart()

        val button = findViewById<Button>(R.id.button_activity_C)
        val button2 = findViewById<Button>(R.id.button_activity_AB)

        button.setOnClickListener {
            val intent = Intent(this, MainActivityC::class.java)
            startActivity(intent)
        }
        button2.setOnClickListener {
            val intent = Intent(this, MainActivityA::class.java)
            startActivity(intent)
        }
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)


    }
}