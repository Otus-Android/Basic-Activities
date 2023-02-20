package otus.gpb.homework.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivityC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)

        val buttonOpenActivityA = findViewById<Button>(R.id.button_OpenActivityA)
        buttonOpenActivityA.setOnClickListener {
            val intentA = Intent(this, ActivityA::class.java)
            intentA.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intentA)
        }

        val buttonOpenActivityD = findViewById<Button>(R.id.button_OpenActivityD)
        buttonOpenActivityD.setOnClickListener {
            val intentD = Intent(this, ActivityD::class.java)
            intentD.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
            startActivity(intentD)
        }

        val buttonCloseActivityC = findViewById<Button>(R.id.button_CloseActivityC)
        buttonCloseActivityC.setOnClickListener {
            finish()
        }

        val buttonCloseStack = findViewById<Button>(R.id.button_CloseStack)
        buttonCloseStack.setOnClickListener {
            val intentA = Intent(this, ActivityA::class.java)
            intentA.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intentA)
            finishAndRemoveTask()
        }
    }
}