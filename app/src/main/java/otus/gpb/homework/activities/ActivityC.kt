package otus.gpb.homework.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivityC : AppCompatActivity(R.layout.activity_c) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        findViewById<Button>(R.id.close_stack_btn).setOnClickListener {  }
        findViewById<Button>(R.id.open_activity_a_btn).setOnClickListener {  }
        findViewById<Button>(R.id.open_activity_b_btn).setOnClickListener {  }
        findViewById<Button>(R.id.open_activity_c_btn).setOnClickListener {  }
    }
}