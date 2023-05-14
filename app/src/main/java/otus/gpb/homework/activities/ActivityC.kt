package otus.gpb.homework.activities

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
            Toast.makeText(this, "Open Activity A", Toast.LENGTH_LONG).show()
        }
        val buttonOpenD = findViewById<Button>(R.id.buttonOpenActivityD)
        buttonOpenD.setOnClickListener {
            Toast.makeText(this, "Open Activity D", Toast.LENGTH_LONG).show()
        }
        val buttonCloseC = findViewById<Button>(R.id.buttonCloseActivityC)
        buttonCloseC.setOnClickListener {
            Toast.makeText(this, "Close Activity C", Toast.LENGTH_LONG).show()
        }
        val buttonClose = findViewById<Button>(R.id.buttonCloseStack)
        buttonClose.setOnClickListener {
            Toast.makeText(this, "Close Stack", Toast.LENGTH_LONG).show()
        }
    }
}