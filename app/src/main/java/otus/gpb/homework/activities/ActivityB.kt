package otus.gpb.homework.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts

class ActivityB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)
    }

    override fun onStart() {
        super.onStart()
        val button = findViewById<Button>(R.id.buttonOpenActivityC)
        button.setOnClickListener{
            val intent = Intent(this, ActivityC::class.java)
            startActivity(intent)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "Close Activity B", Toast.LENGTH_SHORT).show()
    }
}