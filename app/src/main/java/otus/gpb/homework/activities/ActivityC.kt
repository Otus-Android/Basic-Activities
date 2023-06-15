package otus.gpb.homework.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class ActivityC : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activity_c)


    }
    override fun onStart() {
        super.onStart()
        val button = findViewById<Button>(R.id.buttonSecondActivityA)
        button.setOnClickListener {
            val intent = Intent(applicationContext, ActivityA::class.java)
            startActivity(intent)
        }
        val button1 = findViewById<Button>(R.id.buttonSecondActivityD)
        button1.setOnClickListener {
            val intent = Intent(applicationContext, ActivityD::class.java)
            startActivity(intent)
        }
        val button2 = findViewById<Button>(R.id.buttonSecondActivityCloseC)
        button2.setOnClickListener {
           finish()
        }
        val button3 = findViewById<Button>(R.id.buttonSecondActivityCloseS)
        button3.setOnClickListener {
            finishAffinity()
            val intent = Intent(applicationContext, ActivityA::class.java)
            startActivity(intent)
        }


    }

}