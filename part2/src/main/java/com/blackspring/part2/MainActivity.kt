package com.blackspring.part2

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val discountButton: Button get() = findViewById(R.id.discount_button)

    private val firstName: EditText get() = findViewById(R.id.first_name)

    private val lastName: EditText get() = findViewById(R.id.last_name)

    private val email: EditText get() = findViewById(R.id.email_name)

    private val discountConfirme: TextView get() = findViewById(R.id.discount_confirmed)

    private val discountCode: TextView get() = findViewById(R.id.discount_code)

    private val LOG_TAG = MainActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("TAG", "onCreate")

        // Get the Discount code or an empty
        discountCode.text = savedInstanceState?.getString(DISCOUNT_CODE, "")

        // Get the discount confirmation message
        discountConfirme.text = savedInstanceState?.getString(DISCOUNT_CONFIRMATION_MESSAGE, "")


        Log.d(LOG_TAG, "Hello World")
    }

//    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
//        super.onRestoreInstanceState(savedInstanceState)
//        Log.d("TAG", "onRestoreInstanceState")
//
//        // Get the Discount code or an empty
//        discountCode.text = savedInstanceState?.getString(DISCOUNT_CODE, "")
//
//        // Get the discount confirmation message
//        discountConfirme.text = savedInstanceState?.getString(DISCOUNT_CONFIRMATION_MESSAGE, "")
//
//    }
//
//    override fun onSaveInstanceState(outState: Bundle) {
//        super.onSaveInstanceState(outState)
//
//        Log.d("TAG", "onRestoreInstanceState")
//
//        outState.putString(DISCOUNT_CODE, discountCode.text.toString())
//        outState.putString(DISCOUNT_CONFIRMATION_MESSAGE, discountConfirme.text.toString())
//
//    }

    companion object{
        private const val DISCOUNT_CONFIRMATION_MESSAGE = "DISCOUNT_CONFIRMATION_MESSAGE"
        private const val DISCOUNT_CODE = "DISCOUNT_CODE"
    }
}
