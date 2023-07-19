package ru.otus.otusdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

@Suppress("DEPRECATION")
class ActivityB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)
        val button = findViewById<Button>(R.id.act_b_button_open_to_act_C)

        button.setOnClickListener {
            val intent = Intent(applicationContext, ActivityC::class.java)
            startActivity(intent)
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        Toast.makeText(this, "Кнопка бэк была нажата", Toast.LENGTH_SHORT).show()
    }
}
