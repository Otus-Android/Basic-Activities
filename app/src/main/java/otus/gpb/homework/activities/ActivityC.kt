package otus.gpb.homework.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivityC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)

        val opena = findViewById<Button>(R.id.open_a)

        opena.setOnClickListener {

            val intent = Intent(this, ActivityA::class.java)

            startActivity(intent)
        }

        val opend = findViewById<Button>(R.id.open_d)

        opend.setOnClickListener {

            val intent = Intent(this, ActivityD::class.java)

            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)


            startActivity(intent)
        }


        val closec = findViewById<Button>(R.id.close_c)

        closec.setOnClickListener {
            super.onBackPressed()
        }

        val closestack = findViewById<Button>(R.id.close_stack)

        closestack.setOnClickListener {

           finishAffinity()

                    }
    }
}