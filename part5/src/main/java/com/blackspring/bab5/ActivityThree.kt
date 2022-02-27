package com.blackspring.bab5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton

class ActivityThree : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three)

        val clickButtonNumber = View.OnClickListener { view ->
            when(view.id){
                R.id.number1 -> startActivity(Intent(this, ActivityOne::class.java))
                R.id.number2 -> startActivity(Intent(this, ActivityTwo::class.java))
                R.id.back_button -> startActivity(Intent(this, MainActivity::class.java))
            }
        }

        findViewById<Button>(R.id.number1).setOnClickListener(clickButtonNumber)
        findViewById<Button>(R.id.number2).setOnClickListener(clickButtonNumber)
        findViewById<ImageButton>(R.id.back_button)?.setOnClickListener(clickButtonNumber)
    }
}