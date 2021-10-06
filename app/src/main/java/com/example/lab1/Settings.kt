package com.example.lab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.inputmethod.InputBinding

class Settings : AppCompatActivity() {
    private val tag="Zorko.Alexandr"

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("msa","OnCreate Settings")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

    }

    override fun onStart() {
        super.onStart()
        Log.d("msa","OnStart Settings")
    }

    override fun onResume() {
        super.onResume()
        Log.d("msa","OnResume Settings")
    }

    override fun onStop() {
        super.onStop()
        Log.d("msa","OnStop Settings")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("msa","onDestroy Settings")
    }
}