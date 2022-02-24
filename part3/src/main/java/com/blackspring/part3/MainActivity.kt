package com.blackspring.part3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

const val FULL_NAME_KEY = "FULL_NAME_KEY"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // KLIK BUTTON
        findViewById<Button>(R.id.submit_button).setOnClickListener(){

            // MENDAPATKAN EDIT TEXT, FULLNAME
            val fullName = findViewById<EditText>(R.id.text_fullname).text.toString().trim()

            // INTENT
            if (fullName.isNotEmpty()){

                // SET THE NAME OF THE ACTIVITY TO LAUNCH
                Intent(this, WelcomeActivity::class.java)
                    .also { welcomeIntent ->
                        // ADD THE DATA
                        welcomeIntent.putExtra(FULL_NAME_KEY, fullName)
                        // LAUNCH
                        startActivity(welcomeIntent)
                    }
            } else {
                Toast.makeText(this, getString(
                    R.string.full_name_label), Toast.LENGTH_LONG).show()
            }
        }


    }
}