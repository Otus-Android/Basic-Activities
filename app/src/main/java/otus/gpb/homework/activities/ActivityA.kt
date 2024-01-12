package otus.gpb.homework.activities

<<<<<<< HEAD
import android.app.Application
=======
>>>>>>> origin/master
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button


lateinit var button: Button
private const val TAG = "MainActivity"
class ActivityA : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activity)
<<<<<<< HEAD


        button = findViewById<Button>(R.id.openActivityB)
        Log.d(TAG, "call onCreate")


=======
        button = findViewById<Button>(R.id.openActivityB)
        Log.d(TAG,"call onCreate")
>>>>>>> origin/master
    }

    override fun onStart() {
        super.onStart()
        button.setOnClickListener {
<<<<<<< HEAD
            val intent = Intent(this, ActivityB::class.java).apply {
                flags = Intent.FLAG_ACTIVITY_NEW_TASK
            }
            startActivity(intent)

        }


    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
=======
            val intent = Intent(this, ActivityB::class.java)
            startActivity(intent)
            Log.d(TAG,"call onStart")


        }
>>>>>>> origin/master
    }
}
