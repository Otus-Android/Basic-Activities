package otus.gpb.homework.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class ActivityC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)

        val buttonOpenA = findViewById<Button>(R.id.open_activity_a_from_c)
        val buttonOpenD = findViewById<Button>(R.id.open_activity_d_from_c)
        val buttonCloseC = findViewById<Button>(R.id.close_activity_c)
        val buttonCloseStack = findViewById<Button>(R.id.close_stack)

        buttonOpenA.setOnClickListener {
            val intent = Intent(this, ActivityA::class.java)
            startActivity(intent)
        }

        buttonOpenD.setOnClickListener {
            val intent = Intent(this, ActivityD::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
            startActivity(intent)
        }

        buttonCloseC.setOnClickListener {
            finish()
        }

        buttonCloseStack.setOnClickListener {
            finishAffinity()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "onDestroy C", Toast.LENGTH_SHORT).show()
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Toast.makeText(this, "onNewIntent C", Toast.LENGTH_SHORT).show()
    }
}