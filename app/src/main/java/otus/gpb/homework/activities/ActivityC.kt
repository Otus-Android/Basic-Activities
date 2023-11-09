package otus.gpb.homework.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

lateinit var buttonOpenActivitiyA: Button
lateinit var buttonOpenActivityD: Button
lateinit var closeActivityC: Button
lateinit var closeStack: Button

class ActivityC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)

        buttonOpenActivitiyA = findViewById(R.id.openActivityA)
        buttonOpenActivityD = findViewById(R.id.openActivityD)
        closeActivityC = findViewById(R.id.CloseActivityC)
        closeStack = findViewById(R.id.CloseStack)

    }

    override fun onStart() {
        super.onStart()
        buttonOpenActivitiyA.setOnClickListener {

            val intent = Intent(this, ActivityA::class.java).apply{
            flags = Intent.FLAG_ACTIVITY_CLEAR_TOP

        }
        startActivity(intent)
    }

        buttonOpenActivityD.setOnClickListener {
            val intent = Intent(this, ActivityD::class.java).apply {
                flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_SINGLE_TOP
            }
            startActivity(intent)
        }
        closeActivityC.setOnClickListener {
            val intent = Intent(this, ActivityB::class.java)
            finish()

        }
        closeStack.setOnClickListener {
            val intent = Intent(this, ActivityA::class.java).apply {
                flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_SINGLE_TOP
            }
            startActivity(intent)
        }


    }

}



