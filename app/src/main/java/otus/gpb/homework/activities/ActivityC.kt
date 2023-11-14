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

class ActivityC : AppCompatActivity(R.layout.activity_c) {
    private val tag="ActivityC"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val buttonOpenA=findViewById<Button>(R.id.opena)
        buttonOpenA.setOnClickListener {
            Log.d(tag,"OpenA clicked")
            val intent= Intent(this, ActivityA::class.java)
            startActivity(intent)
        }

        val buttonOpenD=findViewById<Button>(R.id.opend)
        buttonOpenD.setOnClickListener {
            Log.d(tag,"OpenD clicked")
            finishAffinity()
            val intent= Intent(this, ActivityD::class.java)
            startActivity(intent)
        }

        val buttonCloseC=findViewById<Button>(R.id.closec)
        buttonCloseC.setOnClickListener {
            Log.d(tag,"CloseC clicked")
            finish()
        }

        val buttonCloseStack=findViewById<Button>(R.id.closestack)
        buttonCloseStack.setOnClickListener {
            Log.d(tag,"CloseStack clicked")
            finishAffinity()
        }
    }


}