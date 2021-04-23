package com.example.trellsubmission

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Hide the status bar.
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        // Remember that you should never show the action bar if the
        // status bar is hidden, so hide that too if necessary.
        actionBar?.hide()

        Timer().schedule(object : TimerTask() {
            override fun run() {
                this@MainActivity.runOnUiThread(Runnable {
                    startActivity(
                            Intent(
                                    this@MainActivity,
                                    Main2Activity::class.java
                            )
                    )
                })
            }
        }, 5000)

        
    }
}