package otus.gpb.homework.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivityB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        val buttonOpenActivityC = findViewById<Button>(R.id.button_OpenActivityC)
        buttonOpenActivityC.setOnClickListener {
            val intentC = Intent(this, ActivityC::class.java)
            startActivity(intentC)
        }
    }
}
