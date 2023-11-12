package otus.gpb.homework.activities
import android.content.Intent
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ActivityC : AppCompatActivity(R.layout.activity_activityc) {

    override fun onStart(){
        super.onStart()
        findViewById<Button>(R.id.buttonc1).setOnClickListener {
            val intent= Intent(this, ActivityA::class.java)
            startActivity(intent)
        }
        findViewById<Button>(R.id.buttonc2).setOnClickListener {
            val intent= Intent(this, ActivityD::class.java)
            intent.flags=Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
            finishAffinity()
            startActivity(intent)
        }
        findViewById<Button>(R.id.buttonc3).setOnClickListener {
            finish()
        }
        findViewById<Button>(R.id.buttonc4).setOnClickListener {
            val intent= Intent(this, ActivityA::class.java)
            finishAffinity()
            startActivity(intent)
        }
    }

}