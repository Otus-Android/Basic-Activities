package ru.otus.otusdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

@Suppress("DEPRECATION")
class ActivityC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)

        val button1 = findViewById<Button>(R.id.act_c_button_to_act_a)
        button1.setOnClickListener {
            val intent = Intent(applicationContext, ActivityA::class.java)
            startActivity(intent)
        }

        val button2 = findViewById<Button>(R.id.act_c_button_to_act_d)
        button2.setOnClickListener {
            val intent = Intent(applicationContext, ActivityD::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
        }

        val button3 =
            findViewById<Button>(R.id.act_c_close_act_c) // По клику на кнопку “CloseActivityC”, завершите ActivityC, и перейдите на предыдущий экран в стеке
        button3.setOnClickListener {
            finish()
//            val intent = Intent(applicationContext, ActivityB::class.java)
//            startActivity(intent)
        }

        val button4 =
            findViewById<Button>(R.id.act_c_close_stack) // По клику на кнопку “Close Stack” завершите текущий стек, в котором находятся ActivityB и ActivityC, и перейдите на ActivityA
        button4.setOnClickListener {
            finishAffinity()
            val intent = Intent(applicationContext, ActivityA::class.java)
            startActivity(intent)
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        Toast.makeText(this, "Кнопка бэк была нажата", Toast.LENGTH_SHORT).show()
    }
}
