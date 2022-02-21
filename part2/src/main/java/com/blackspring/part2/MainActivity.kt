package com.blackspring.part2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private val discountButton: Button get() = findViewById(R.id.discount_button)

    private val firstName: EditText get() = findViewById(R.id.first_name)

    private val lastName: EditText get() = findViewById(R.id.last_name)

    private val email: EditText get() = findViewById(R.id.email_name)

    private val discountConfirme: TextView get() = findViewById(R.id.discount_confirmed)

    private val discountCode: TextView get() = findViewById(R.id.discount_code)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("TAG", "onCreate")

    }
}
