package otus.gpb.homework.activities

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivityA : AppCompatActivity(R.layout.activity_main_a) {

    val button = findViewById<Button>(R.id.button_activity_B)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        super.onStart()

//        button.setOnClickListener {
//            val intent = Intent(this, MainActivityA::class.java)
//            startActivity(intent)
//        }
    }
}