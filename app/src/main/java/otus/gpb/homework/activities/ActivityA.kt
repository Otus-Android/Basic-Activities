package otus.gpb.homework.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class ActivityA : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)

        val buttonOpenActivityB = findViewById<Button>(R.id.button_OpenActivityB)
        buttonOpenActivityB.setOnClickListener {
            val intentB = Intent(this, ActivityB::class.java)
            intentB.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intentB)
        }
        Toast.makeText(this, "ActivityA created", Toast.LENGTH_SHORT).show()
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Toast.makeText(this, "ActivityA reopened", Toast.LENGTH_SHORT).show()
    }

}