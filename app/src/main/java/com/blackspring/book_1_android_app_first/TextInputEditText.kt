package com.blackspring.book_1_android_app_first

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class TextInputEditText : AppCompatActivity() {

    private val LOG_TAG: String = TextInputEditText::class.java.getSimpleName()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_input_edit_text)
//
//        findViewById<Button>(R.id.enter_button)?.setOnClickListener(){
//
//            val firstName = findViewById<TextInputEditText>(R.id.first_name).text.toString().trim()
//
//            val lastName = findViewById<TextInputEditText>(R.id.last_name).text.toString().trim()
//
//            val displayName = findViewById<TextView>(R.id.greeting_display)
//
//            if (firstName.isNotEmpty() && lastName.isNotEmpty()){
//                val fullName = firstName.plus(" ").plus(lastName)
//
//                displayName?.text = "${getString(R.string.welcome_to_the_app)} ${fullName}!"
//            } else {
//                Toast.makeText(this, getString(R.string.please_enter_a_name), Toast.LENGTH_LONG).
//                        apply {
//                            setGravity(Gravity.CENTER, 0, 0)
//                            show()
//                        }
//            }
//        }

        Log.d(LOG_TAG, "Hello World")

    }

}