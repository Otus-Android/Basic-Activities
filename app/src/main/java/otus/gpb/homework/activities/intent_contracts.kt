package otus.gpb.homework.activities

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.activity.result.contract.ActivityResultContract

class BAndCContract(): ActivityResultContract<String, String?>(){
    override fun createIntent(context: Context, input: String): Intent {
        return Intent(context, ActivityC::class.java)
    }

    override fun parseResult(resultCode: Int, intent: Intent?):String?{
        if(intent == null) return null
        if(resultCode != Activity.RESULT_OK) return null
        return intent.getStringExtra("key")
    }
}