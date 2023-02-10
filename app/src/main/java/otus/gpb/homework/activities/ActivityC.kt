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

        val buttonOpenA = findViewById<Button>(R.id.openActivityAFromC)
        val buttonOpenD = findViewById<Button>(R.id.openActivityDFromC)
        val buttonCloseC = findViewById<Button>(R.id.closeActivityC)
        val buttonCloseStack = findViewById<Button>(R.id.closeStack)

        buttonOpenA.setOnClickListener {
            val intent = Intent(this, ActivityA::class.java)
            startActivity(intent)
        }

        buttonOpenD.setOnClickListener {
            val intent = Intent(this, ActivityD::class.java)
            startActivity(intent)
            finishAffinity()
        }

        buttonCloseC.setOnClickListener {
            finish()
        }

        buttonCloseStack.setOnClickListener {
            val intent = Intent(this, ActivityA::class.java)
            startActivity(intent)
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