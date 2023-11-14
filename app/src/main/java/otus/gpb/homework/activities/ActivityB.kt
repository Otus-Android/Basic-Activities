package otus.gpb.homework.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import android.util.Log

class ActivityB : AppCompatActivity(R.layout.activity_b) {
    private val tag="ActivityB"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val button=findViewById<Button>(R.id.openc)
        button.setOnClickListener {
            Log.d(tag,"OpenC clicked")
            val intent= Intent(this, ActivityC::class.java)
            startActivity(intent)
        }
    }


}