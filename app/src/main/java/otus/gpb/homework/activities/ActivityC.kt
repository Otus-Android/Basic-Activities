package otus.gpb.homework.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivityC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)

        findViewById<Button>(R.id.buttonActivityCOpenA).setOnClickListener {}
        findViewById<Button>(R.id.buttonActivityCOpenD).setOnClickListener {}
        findViewById<Button>(R.id.buttonActivityCClose).setOnClickListener {}
        findViewById<Button>(R.id.buttonActivityCCloseStack).setOnClickListener {}
    }
}