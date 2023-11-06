package otus.gpb.homework.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivityC : AppCompatActivity(R.layout.activity_c) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        findViewById<Button>(R.id.close_stack_btn).setOnClickListener { closeTask() }
        findViewById<Button>(R.id.open_activity_a_btn).setOnClickListener { openActivityA() }
        findViewById<Button>(R.id.open_activity_d_btn).setOnClickListener { openActivityD() }
        findViewById<Button>(R.id.close_activity_c_btn).setOnClickListener { closeActivityC() }
    }

    private fun openActivityA() {
        val intent = Intent(this, ActivityA::class.java)
        startActivity(intent)
    }

    private fun openActivityD() {
        val intent = Intent(this, ActivityD::class.java).apply {
            flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
        }
        startActivity(intent)
    }

    private fun closeActivityC() {
        finish()
    }

    private fun closeTask() {
        finishAffinity()
        val intent = Intent(this, ActivityA::class.java)
        startActivity(intent)
    }
}