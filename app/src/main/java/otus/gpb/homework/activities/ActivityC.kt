package otus.gpb.homework.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivityC : AppCompatActivity(R.layout.activity_c) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        super.onStart()

        val buttonOpenActivityA = findViewById<Button>(R.id.button4)

        buttonOpenActivityA.setOnClickListener {
            val intent = Intent(this, ActivityA::class.java)
            startActivity(intent)
        }

        val buttonOpenActivityD = findViewById<Button>(R.id.button3)

        buttonOpenActivityD.setOnClickListener {
            val intent = Intent(this, ActivityD::class.java)

            finishAffinity()
            startActivity(intent)
        }

        val buttonCloseActivityC = findViewById<Button>(R.id.button2)

        buttonCloseActivityC.setOnClickListener {
            finish()
        }


        val buttonCloseStack = findViewById<Button>(R.id.button)

        buttonCloseStack.setOnClickListener {
            val intent = Intent(this, ActivityA::class.java)

            finishAffinity()
            startActivity(intent)
        }
    }
}