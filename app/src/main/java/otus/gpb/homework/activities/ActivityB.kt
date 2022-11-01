package otus.gpb.homework.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class ActivityB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)
    }

    fun onClickGoC(view: View) {
        val intent = Intent(this, ActivityC::class.java)
        startActivity(intent)
    }
}