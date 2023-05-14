package otus.gpb.homework.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class ActivityA : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)
    }

    override fun onStart() {
        super.onStart()
        val button = findViewById<Button>(R.id.buttonActivityB)
        button.setOnClickListener {
            Toast.makeText(this, "open activity B", Toast.LENGTH_SHORT).show()
            //val intent = Intent(applicationContext, SecondActivity::class.java)
            //startActivity(intent)
        }
    }
}