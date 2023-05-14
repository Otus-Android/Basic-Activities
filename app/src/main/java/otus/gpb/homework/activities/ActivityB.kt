package otus.gpb.homework.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class ActivityB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)
    }

    override fun onStart() {
        super.onStart()
        val button = findViewById<Button>(R.id.buttonOpenActivityC)
        button.setOnClickListener{
            Toast.makeText(this,"Open Activity C",Toast.LENGTH_LONG).show()
        }
    }
}