package otus.gpb.homework.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class ActivityD : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_d)
        Toast.makeText(this, taskId.toString(), Toast.LENGTH_SHORT).show()
        this.intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
    }
}