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
        closeCBtn.setOnClickListener { closeC() }
        val closeStackBtn = findViewById<Button>(R.id.closeStackBtn)
        closeStackBtn.setOnClickListener { closeStack() }
        Toast.makeText(this, taskId.toString(), Toast.LENGTH_SHORT).show()

    }



    private fun returnToA(){
        startActivity(Intent(this, ActivityA::class.java)

        )

    }

    private fun openD(){
        this.finish()
        startActivity(Intent(this, ActivityD::class.java)
            .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)

        )

    }

    private fun closeC(){
        val intent = Intent(this, ActivityB::class.java)
        startActivity(intent
            .setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)

        )
    }


    private fun closeStack(){

        startActivity(
            Intent(this, ActivityA::class.java)
                .addFlags(Intent.FLAG_ACTIVITY_TASK_ON_HOME)

            )

    }
}