package com.example.lab1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("msa","OnCreate Main")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val settingButton: Button = findViewById(R.id.setting_button)
        settingButton.setOnClickListener{click("setting clicked")}

        val aboutButton: Button = findViewById(R.id.about_button)
        aboutButton.setOnClickListener{click("about clicked")}
    }

    private fun click(s:String){
         Toast.makeText(this, s, Toast.LENGTH_SHORT).show()

        if (s[0]=='s')  startActivity(Intent(this, Settings::class.java))
        else startActivity(Intent(this, About::class.java))
    }

    override fun onStart() {
        super.onStart()
        Log.d("msa","OnStart Main")
    }

    override fun onResume() {
        super.onResume()
        Log.d("msa","OnResume Main")
    }

    override fun onStop() {
        super.onStop()
        Log.d("msa","OnStop Main")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("msa","onDestroy Main")
    }
}