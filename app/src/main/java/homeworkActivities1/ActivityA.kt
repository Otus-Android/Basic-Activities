package homeworkActivities1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import otus.gpb.homework.activities.R
class ActivityA : AppCompatActivity(R.layout.activity_a) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        super.onStart()
        println("Стек активити А равен $taskId")

        val buttonOpenB = findViewById<Button>(R.id.buttonOpenBFromA)
        buttonOpenB.setOnClickListener {
            println("You clicked on button ${R.string.open_activity_b}")
            val intent = Intent(this, ActivityB::class.java).apply {
                flags = Intent.FLAG_ACTIVITY_NEW_TASK
            }
            startActivity(intent)
        }
    }
}