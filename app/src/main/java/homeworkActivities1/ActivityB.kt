package homeworkActivities1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import otus.gpb.homework.activities.R

class ActivityB : AppCompatActivity(R.layout.activity_b) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        super.onStart()
        println("Стек активити В равен $taskId")

        val buttonOpenC = findViewById<Button>(R.id.buttonOpenCFromB)
        buttonOpenC.setOnClickListener {
            println("You clicked on button ${R.string.open_activity_c}")
            val intent = Intent(this, ActivityC::class.java)
            startActivity(intent)
        }
    }
}