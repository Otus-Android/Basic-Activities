package otus.gpb.homework.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class ActivityB : AppCompatActivity(R.layout.activity_activityb) {

    override fun onStart(){
        super.onStart()
        findViewById<Button>(R.id.buttonOnB).setOnClickListener {
            val intent= Intent(this, ActivityC::class.java)
            startActivity(intent)
        }
    }

}