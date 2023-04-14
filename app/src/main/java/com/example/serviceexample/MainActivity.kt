package com.example.serviceexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.work.PeriodicWorkRequestBuilder
import androidx.work.WorkManager
import com.example.serviceexample.databinding.ActivityMainBinding
import java.sql.Time
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.btn.setOnClickListener {
            val worker = PeriodicWorkRequestBuilder<MyService>(15,TimeUnit.MINUTES).build()
            WorkManager.getInstance(this@MainActivity).enqueue(worker)
        }
    }
}