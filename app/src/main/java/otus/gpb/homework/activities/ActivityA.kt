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
        val openBBtn = findViewById<Button>(R.id.open_b_from_a_button)
        openBBtn.setOnClickListener { openB() }
        Toast.makeText(this, "On create $taskId", Toast.LENGTH_SHORT).show()
    }


    private fun openB(){
        startActivity(Intent(this, ActivityB::class.java))
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Toast.makeText(this, "New Intent  $taskId", Toast.LENGTH_SHORT).show()
    }
}