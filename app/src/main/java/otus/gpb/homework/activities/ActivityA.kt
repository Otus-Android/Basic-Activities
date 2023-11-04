package otus.gpb.homework.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import otus.gpb.homework.logWithTasks

class ActivityA : AppCompatActivity(R.layout.activity_a) {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    logWithTasks(TAG, "onCreate")

    title = localClassName
  }

  override fun onStart() {
    super.onStart()
    logWithTasks(TAG, "onStart")

    findViewById<Button>(R.id.btnOpenActivityB).setOnClickListener {
      val intent = Intent(this, ActivityB::class.java)
      startActivity(intent)
    }
  }

  override fun onResume() {
    super.onResume()
    logWithTasks(TAG, "onResume")
  }

  override fun onPause() {
    super.onPause()
    logWithTasks(TAG, "onPause")
  }

  override fun onStop() {
    super.onStop()
    logWithTasks(TAG, "onStop")
  }

  override fun onDestroy() {
    super.onDestroy()
    logWithTasks(TAG, "onDestroy")
  }

  override fun onRestart() {
    super.onRestart()
    logWithTasks(TAG, "onRestart")
  }

  override fun onNewIntent(intent: Intent?) {
    super.onNewIntent(intent)
    logWithTasks(TAG, "onNewIntent")
  }

  companion object {
    private val TAG = ActivityA::class.simpleName
  }
}