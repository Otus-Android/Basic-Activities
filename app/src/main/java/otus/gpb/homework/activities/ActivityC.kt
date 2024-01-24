package otus.gpb.homework.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivityC : AppCompatActivity() {
    private lateinit var buttonOpenA:Button
    private lateinit var buttonOpenD:Button
    private lateinit var buttonCloseC:Button
    private lateinit var buttonCloseAll:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)

        buttonOpenA = findViewById(R.id.buttonOpenA)
        buttonOpenD = findViewById(R.id.buttonOpenD)
        buttonCloseC = findViewById(R.id.buttonCloseC)
        buttonCloseAll = findViewById(R.id.buttonCloseAll)

        buttonOpenA.setOnClickListener(){
            val intent = Intent(this, ActivityA::class.java)
            startActivity(intent)
        }
        buttonOpenD.setOnClickListener() {
            val intent = Intent(this, ActivityD::class.java).apply{
                flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
            }
            startActivity(intent)

        }


        buttonCloseC.setOnClickListener() {
            finish()
        }
        buttonCloseAll.setOnClickListener() {
            val intent = Intent(this, ActivityA::class.java).apply {
                flags = Intent.FLAG_ACTIVITY_CLEAR_TASK
            }
            startActivity(intent)
        }
    }
}