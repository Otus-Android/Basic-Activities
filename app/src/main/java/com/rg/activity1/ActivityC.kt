package com.rg.activity1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.rg.activity1.databinding.ActivityABinding
import com.rg.activity1.databinding.ActivityCBinding

class ActivityC : AppCompatActivity() {
    private val binding: ActivityCBinding by lazy { ActivityCBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        Log.d(taskId.toString(), "OnCreate ${this.localClassName}")
    }

    override fun onStart() {
        super.onStart()
        binding.buttonGoToA.setOnClickListener {
            startActivity(Intent(applicationContext, ActivityA::class.java))
        }
        binding.buttonCloseC.setOnClickListener {
            finish()
        }
        binding.buttonGoToD.setOnClickListener {
            startActivity(Intent(applicationContext, ActivityD::class.java))
            finishAffinity()
        }
        binding.buttonCloseStack.setOnClickListener {
            finishAffinity()
        }
        Log.d(taskId.toString(), "OnStart ${this.localClassName}")
    }
}