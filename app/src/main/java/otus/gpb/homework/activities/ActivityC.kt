package otus.gpb.homework.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivityC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)
    }

    override fun onStart() {
        super.onStart()

        val buttonOpenActivityA = findViewById<Button>(R.id.openActivityA)
        val buttonOpenActivityD = findViewById<Button>(R.id.openActivityD)
        val buttonCloseActivityC = findViewById<Button>(R.id.closeActivityC)
        val buttonCloseStack = findViewById<Button>(R.id.closeStack)

        buttonOpenActivityA.setOnClickListener {
            val intent = Intent(this, ActivityA::class.java)
            startActivity(intent)
        }
        buttonOpenActivityD.setOnClickListener {
            val intent = Intent(this, ActivityD::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(intent)
        }
        buttonCloseActivityC.setOnClickListener {
            finish()
        }
        buttonCloseStack.setOnClickListener {
            val intent = Intent(this, ActivityA::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
            startActivity(intent)
        }
    }
}