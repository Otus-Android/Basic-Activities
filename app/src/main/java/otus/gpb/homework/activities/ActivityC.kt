package otus.gpb.homework.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivityC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)

        val buttonOpenActivityA = findViewById<Button>(R.id.openActivityA)
        buttonOpenActivityA.setOnClickListener{

        }

        val buttonOpenActivityD = findViewById<Button>(R.id.openActivityD)
        buttonOpenActivityD.setOnClickListener{

        }

        val buttonCloseActivityC = findViewById<Button>(R.id.closeActivityC)
        buttonCloseActivityC.setOnClickListener{

        }

        val buttonCloseStack = findViewById<Button>(R.id.closeStack)
        buttonCloseStack.setOnClickListener{

        }
    }
}