package otus.gpb.homework.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class ActivityC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)
        val openAbutton = findViewById<Button>(R.id.openAButton)
        openAbutton.setOnClickListener { onOpenAClickListener() }
        val closeCButton = findViewById<Button>(R.id.closeCButton)
        closeCButton.setOnClickListener { onCloseCButtonClickListener() }
        val closeStackButton = findViewById<Button>(R.id.closeStackButton)
        closeStackButton.setOnClickListener { onCloseStackButtonClickListener() }
        val openDButton = findViewById<Button>(R.id.openDButton)
        openDButton.setOnClickListener { onOpenDButtonClickListener() }
        val textView = findViewById<TextView>(R.id.textView)
        textView.text = "ActivityC, task=$taskId"
    }

    private fun onOpenAClickListener() {
        val intent = Intent(this, ActivityA::class.java)
        startActivity(intent)
    }

    private fun onCloseCButtonClickListener() {
        finish()
    }

    private fun onCloseStackButtonClickListener() {
        //завершите текущий стек, в котором находятся ActivityB и ActivityC, и перейдите на ActivityA
        finishAffinity()
    }

    private fun onOpenDButtonClickListener() {
        //запустите ActivityD в том же стеке, где расположены ActivityB и ActivityC, при этом завершите все предыдущие Activity, которые находятся в текущем стеке
        val intent = Intent(this, ActivityD::class.java)
        intent
            .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        startActivity(intent)
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "onDestroy C", Toast.LENGTH_SHORT).show()
    }
}