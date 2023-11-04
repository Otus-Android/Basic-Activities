package otus.gpb.homework.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import otus.gpb.homework.logWithTasks

class ActivityC : AppCompatActivity(R.layout.activity_c) {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    logWithTasks(TAG, "onCreate")

    title = localClassName
  }

  override fun onStart() {
    super.onStart()
    logWithTasks(TAG, "onStart")

    findViewById<Button>(R.id.btnOpenActivityA).setOnClickListener {
      val intent = Intent(this, ActivityA::class.java)
      startActivity(intent)
    }
    findViewById<Button>(R.id.btnOpenActivityD).setOnClickListener {
      val intent = Intent(this, ActivityD::class.java)
      intent.flags =
        Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_CLEAR_TASK
      startActivity(intent)
      finishAffinity()
    }
    findViewById<Button>(R.id.btnCloseActivityC).setOnClickListener {
      finish()
    }
    findViewById<Button>(R.id.btnCloseStack).setOnClickListener {
      finishAffinity()
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
    private val TAG = ActivityC::class.simpleName
  }
}