package otus.gpb.homework.activities

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.core.view.ContentInfoCompat.Flags


class ActivityA : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)
        val openBBtn = findViewById<Button>(R.id.openBFromABtn)
        openBBtn.setOnClickListener { openActB() }
        Toast.makeText(this, "On create $taskId", Toast.LENGTH_SHORT).show()
    }


    private fun openActB(){
        startActivity(Intent(this, ActivityB::class.java)
            .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            .addFlags(Intent.FLAG_ACTIVITY_MULTIPLE_TASK)


        )
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Toast.makeText(this, "New Intent  $taskId", Toast.LENGTH_SHORT).show()
    }
}