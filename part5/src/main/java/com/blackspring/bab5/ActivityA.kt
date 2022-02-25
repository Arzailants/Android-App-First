package com.blackspring.bab5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton

class ActivityA : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)

        val buttonClickListener = View.OnClickListener { view ->
            when(view.id){
                R.id.letterB -> startActivity(Intent(this, ActivityB::class.java))
                R.id.letterC -> startActivity(Intent(this, ActivityC::class.java))
            }
        }

        val buttonBackMenu = View.OnClickListener { view ->
            when(view.id){
                R.id.back_button -> startActivity(Intent(this, MainActivity::class.java))
            }
        }

        findViewById<View>(R.id.letterB).setOnClickListener(buttonClickListener)
        findViewById<View>(R.id.letterC).setOnClickListener(buttonClickListener)
        findViewById<ImageButton>(R.id.back_button)?.setOnClickListener(buttonBackMenu)
    }
}