package com.rg.activity1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.rg.activity1.databinding.ActivityABinding
import com.rg.activity1.databinding.ActivityBBinding

class ActivityB : AppCompatActivity() {
    private val binding: ActivityBBinding by lazy { ActivityBBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        Log.d(taskId.toString(), "OnCreate ${this.localClassName}")
    }

    override fun onStart() {
        super.onStart()
        binding.buttonGoToC.setOnClickListener {
            startActivity(Intent(applicationContext, ActivityC::class.java).setFlags(Intent.FLAG_ACTIVITY_NEW_TASK))
        }
        Log.d(taskId.toString(), "OnStart ${this.localClassName}")
    }
}