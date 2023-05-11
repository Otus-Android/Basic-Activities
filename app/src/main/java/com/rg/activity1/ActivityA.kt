package com.rg.activity1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.rg.activity1.databinding.ActivityABinding
import android.widget.Button

class ActivityA : AppCompatActivity() {
    private val binding: ActivityABinding by lazy { ActivityABinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        Log.d(taskId.toString(), "OnCreate ${this.localClassName}")
    }

    override fun onStart() {
        super.onStart()
        binding.buttonGoToB.setOnClickListener {
            startActivity(Intent(applicationContext, ActivityB::class.java).setFlags(Intent.FLAG_ACTIVITY_NEW_TASK))
        }
        Log.d(taskId.toString(), "OnStart ${this.localClassName}")
    }
}