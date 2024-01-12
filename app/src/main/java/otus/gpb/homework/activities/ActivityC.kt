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

<<<<<<< HEAD
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
=======
            val intent = Intent(this, ActivityA::class.java)
            startActivity(intent)
        }
        buttonOpenActivityD.setOnClickListener {
            val intent = Intent(this, ActivityD::class.java)
            startActivity(intent)
        }
        closeActivityC.setOnClickListener {
            val intent = Intent(this, ActivityC::class.java)
>>>>>>> origin/master
            finish()

        }
        closeStack.setOnClickListener {
<<<<<<< HEAD
            val intent = Intent(this, ActivityA::class.java).apply {
                flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_SINGLE_TOP
            }
            startActivity(intent)
=======
            val intent = Intent(this, ActivityC::class.java)
            finishAffinity()
>>>>>>> origin/master
        }


    }

<<<<<<< HEAD
}



=======
    private fun finishAffinity(intent:Intent) {

    }

    private fun finishActivity() {
        TODO("Not yet implemented")
    }
}
>>>>>>> origin/master
