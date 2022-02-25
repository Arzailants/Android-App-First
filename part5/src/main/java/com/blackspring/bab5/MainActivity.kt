package com.blackspring.bab5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.blackspring.bab5.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonClickLetterListener = View.OnClickListener { view ->

            when(view.id){
                R.id.letterA -> startActivity(Intent(this, ActivityA::class.java))
                R.id.letterB -> startActivity(Intent(this, ActivityB::class.java))
                R.id.letterC -> startActivity(Intent(this, ActivityC::class.java))

                else -> {
                    Toast.makeText(this, getString(R.string.unexpected_button_pressed), Toast.LENGTH_LONG).show()
                }
            }
        }

        val buttonClickNumberListener = View.OnClickListener { view ->
            when(view.id){
                R.id.number1 -> startActivity(Intent(this, ActivityOne::class.java))
                R.id.number2 -> startActivity(Intent(this, ActivityTwo::class.java))
                R.id.number3 -> startActivity(Intent(this, ActivityThree::class.java))
            }
        }

        // MENGKLIK BUTTON
        // LETTER A,B,C
        findViewById<Button>(R.id.letterA).setOnClickListener(buttonClickLetterListener)
        findViewById<View>(R.id.letterB).setOnClickListener(buttonClickLetterListener)
        findViewById<View>(R.id.letterC).setOnClickListener(buttonClickLetterListener)

        // NUMBER 1,2,3
        findViewById<Button>(R.id.number1).setOnClickListener(buttonClickNumberListener)
        findViewById<Button>(R.id.number2).setOnClickListener(buttonClickNumberListener)
        findViewById<Button>(R.id.number3).setOnClickListener(buttonClickNumberListener)
    }
}