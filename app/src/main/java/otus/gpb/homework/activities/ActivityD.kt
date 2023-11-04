package otus.gpb.homework.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class ActivityD : AppCompatActivity(R.layout.activity_d) {

    override fun onStart() {
        super.onStart()
        Log.d(this::class.simpleName, "Started in stack $taskId")
    }
}