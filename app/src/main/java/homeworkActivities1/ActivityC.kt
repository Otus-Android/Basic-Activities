package homeworkActivities1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import otus.gpb.homework.activities.R

class ActivityC : AppCompatActivity(R.layout.activity_c) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        super.onStart()
        println("Стек активити C равен ${this.taskId}")

        val buttonOpenA = findViewById<Button>(R.id.buttonOpenAFromC)
        buttonOpenA.setOnClickListener {
            println("You clicked on button ${R.string.open_activity_a}")
            val intent = Intent(this, ActivityA::class.java)
            startActivity(intent)
        }

        val buttonOpenD = findViewById<Button>(R.id.buttonOpenDFromC)
        buttonOpenD.setOnClickListener {
            println("You clicked on button ${R.string.open_activity_d}")
            val intent = Intent(this, ActivityD::class.java).apply {
                flags = Intent.FLAG_ACTIVITY_CLEAR_TASK
            }
            startActivity(intent)
        }

        val buttonCloseC = findViewById<Button>(R.id.buttonCloseCFromC)
        buttonCloseC.setOnClickListener {
            println("You clicked on button ${R.string.close_activity_c}")
            finish()
        }

        val buttonCloseStack = findViewById<Button>(R.id.buttonCloseStackFromC)
        buttonCloseStack.setOnClickListener {
            println("You clicked on button ${R.string.close_stack}")
            val intent = Intent(this, ActivityA::class.java).apply {
                flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            }
            startActivity(intent)
        }
    }
}