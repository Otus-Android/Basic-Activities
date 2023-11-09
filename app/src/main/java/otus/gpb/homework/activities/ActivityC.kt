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

            val intent = Intent(this, ActivityA::class.java)
            startActivity(intent)
        }
        buttonOpenActivityD.setOnClickListener {
            val intent = Intent(this, ActivityD::class.java)
            startActivity(intent)
        }
        closeActivityC.setOnClickListener {
            val intent = Intent(this, ActivityC::class.java)
            finish()

        }
        closeStack.setOnClickListener {
            val intent = Intent(this, ActivityC::class.java)
            finishAffinity()
        }


    }

    private fun finishAffinity(intent:Intent) {

    }

    private fun finishActivity() {
        TODO("Not yet implemented")
    }
}
