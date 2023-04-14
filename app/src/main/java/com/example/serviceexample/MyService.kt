package com.example.serviceexample

import android.app.Service
import android.content.Context
import android.content.Intent
import android.os.IBinder
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters
import java.text.SimpleDateFormat
import java.util.Date

private const val TAG = "MyService"
class MyService(context: Context,workerParemeters:WorkerParameters) : Worker(context,workerParemeters) {

    override fun doWork(): Result {

        val date = SimpleDateFormat("dd.MM.yyyy  HH:mm:ss").format(Date())
        Log.d(TAG, "doWork: $date")

        return Result.success()
    }
}