package otus.gpb.homework.activities

import android.content.Intent
import android.content.Intent.FLAG_ACTIVITY_CLEAR_TASK
import android.content.Intent.FLAG_ACTIVITY_NEW_TASK
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class ActivityC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)
    }

    override fun onStart() {
        super.onStart()
        val buttonOpenA = findViewById<Button>(R.id.buttonOpenActivityA)
        buttonOpenA.setOnClickListener {
            val intent = Intent(this, ActivityA::class.java)
            startActivity(intent)
        }
        val buttonOpenD = findViewById<Button>(R.id.buttonOpenActivityD)
        buttonOpenD.setOnClickListener {
            val intent = Intent(this, ActivityD::class.java)
            //intent.addFlags(FLAG_ACTIVITY_NEW_TASK and FLAG_ACTIVITY_CLEAR_TASK)
            startActivity(intent)
            finishAffinity()
        }
        val buttonCloseC = findViewById<Button>(R.id.buttonCloseActivityC)
        buttonCloseC.setOnClickListener {
            onBackPressed()
        }
        val buttonClose = findViewById<Button>(R.id.buttonCloseStack)
        buttonClose.setOnClickListener {
            finishAffinity()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "Close Activity C", Toast.LENGTH_LONG).show()
    }
}