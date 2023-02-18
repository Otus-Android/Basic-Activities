package otus.gpb.homework.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class ActivityA : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)
        val button = findViewById<Button>(R.id.open_b_button)
        button.setOnClickListener { onClickListener()}
        val textView = findViewById<TextView>(R.id.text_view)
        textView.text = "ActivityA, task=$taskId"
    }

    private fun onClickListener() {
        val intent = Intent(this, ActivityB::class.java)
        startActivity(intent)
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Toast.makeText(this, "onNewIntent A", Toast.LENGTH_SHORT).show()
    }
}