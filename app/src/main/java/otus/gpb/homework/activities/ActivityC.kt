package otus.gpb.homework.activities


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast


class ActivityC() : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)
        val openABtn = findViewById<Button>(R.id.openAFromCBtn)
        openABtn.setOnClickListener { returnToA() }
        val openDBtn = findViewById<Button>(R.id.openDFromCBtn)
        openDBtn.setOnClickListener { openD() }
        val closeCBtn = findViewById<Button>(R.id.closeCBtn)
        closeCBtn.setOnClickListener { finish() }
        val closeStackBtn = findViewById<Button>(R.id.closeStackBtn)
        closeStackBtn.setOnClickListener { closeStack() }
        Toast.makeText(this, taskId.toString(), Toast.LENGTH_SHORT).show()

    }

    private fun returnToA(){
        startActivity(Intent(this, ActivityA::class.java)
        )
    }

    private fun openD(){
        startActivity(Intent(this, ActivityD::class.java))
        finishAffinity()
    }

    private fun closeStack(){
        intent = Intent().putExtra("key", "destroyYourself!")
        setResult(RESULT_OK, intent)
        finish()
    }

}