package ru.otus.otusdemo.examples

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.activity.result.contract.ActivityResultContract
import ru.otus.otusdemo.MainActivity

class ContractMainActivityAndSecondActivity : ActivityResultContract<String, String?>() {

    override fun createIntent(context: Context, input: String): Intent {
        //return Intent(context, SecondActivity::class.java).apply {
        return Intent(context, MainActivity::class.java).apply {
            putExtra("currentName", input)
        }
    }

    override fun parseResult(resultCode: Int, intent: Intent?): String? {
        if (intent == null) return null
        if (resultCode != Activity.RESULT_OK) return null

        return intent.getStringExtra("resultKey")
    }
}