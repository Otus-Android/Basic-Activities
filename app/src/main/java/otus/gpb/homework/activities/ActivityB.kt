package otus.gpb.homework.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class ActivityB : AppCompatActivity() {
    private val contract = registerForActivityResult(BAndCContract()){
        result -> if(result == "destroyYourself!"){
            startActivity(Intent(this, ActivityA::class.java))
            finishAndRemoveTask()
    }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)
        val openCBtn = findViewById<Button>(R.id.open_c_from_b_button)
        openCBtn.setOnClickListener { openC() }
        Toast.makeText(this, taskId.toString(), Toast.LENGTH_SHORT).show()

    }

    private fun openC(){
        contract.launch("")

    }
}


