package com.example.lab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class About : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("msa","OnCreate About")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
    }

    override fun onStart() {
        super.onStart()
        Log.d("msa","OnStart About")
    }

    override fun onResume() {
        super.onResume()
        Log.d("msa","OnResume About")
    }

    override fun onStop() {
        super.onStop()
        Log.d("msa","OnStop About")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("msa","onDestroy About")
    }
}