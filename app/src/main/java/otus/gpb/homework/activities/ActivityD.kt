package otus.gpb.homework.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class ActivityD : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_d)
    }
    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "Close Activity D", Toast.LENGTH_LONG).show()
    }
}