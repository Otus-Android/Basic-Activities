package otus.gpb.homework

import android.app.Activity
import android.app.ActivityManager
import android.content.Context.ACTIVITY_SERVICE
import android.os.Build
import android.util.Log

fun Activity.logWithTasks(tag: String?, text: String) {
  val TAG = tag ?: localClassName
  val am = getSystemService(ACTIVITY_SERVICE) as ActivityManager
  val appTasks = am.getRunningTasks(10)
  val msg = buildString {
    append("$text | activity task id: $taskId | app tasks: ${appTasks.size} |")

    appTasks.forEachIndexed { index, runningTaskInfo ->
      if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
        append(
          "\n  app task: $index:\n" +
          listOf(
            "    app task id: ${runningTaskInfo.taskId}",
            "    numActivities: ${runningTaskInfo.numActivities}",
            "    topActivity: ${runningTaskInfo.topActivity?.className}",
            "    baseActivity: ${runningTaskInfo.baseActivity?.className}"
          ).joinToString(separator = ",\n")
        )
      }
    }
  }
  Log.d(TAG, msg)
}