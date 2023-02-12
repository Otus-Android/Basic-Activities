package otus.gpb.homework.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class ActivityB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)
        val openCBtn = findViewById<Button>(R.id.openCFromBBtn)
        openCBtn.setOnClickListener { openActC() }
        Toast.makeText(this, taskId.toString(), Toast.LENGTH_SHORT).show()
        intentB = this

    }

    private fun openActC(){
        startActivity(Intent(this, ActivityC::class.java)

        )
    }
}


