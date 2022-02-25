package com.blackspring.bab5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton

class ActivityC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)

        val buttonClickListener = View.OnClickListener { view ->
            when(view.id){
                R.id.letterA -> startActivity(Intent(this, ActivityA::class.java))
                R.id.letterB -> startActivity(Intent(this, ActivityB::class.java))
            }
        }

        val buttonBackMenu = View.OnClickListener { view ->
            when(view.id){
                R.id.back_button -> startActivity(Intent(this, MainActivity::class.java))
            }
        }

        findViewById<Button>(R.id.letterA).setOnClickListener(buttonClickListener)
        findViewById<Button>(R.id.letterB).setOnClickListener(buttonClickListener)
        findViewById<ImageButton>(R.id.back_button)?.setOnClickListener(buttonBackMenu)
    }
}