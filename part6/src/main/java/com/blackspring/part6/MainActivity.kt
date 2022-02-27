package com.blackspring.part6

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

const val USER_NAME_KEY = "USER_NAME_KEY"
const val PASSWORD_KEY = "PASSWORD_KEY"

const val IS_LOGGED_IN = "IS_LOGGED_IN"
const val LOGGED_IN_USERNAME = "LOGGED_IN_USERNAME"

// THIS IS DONE AS AN EXAMPLE FOR SIMPLICITY AND USER/PWD CREDENTIALS SHOULD NEVER BE STORED IN AN APP
const val USER_NAME_CORRECT_VALUE = "someusername"
const val PASSWORD_CORRECT_VALUE = "somepassword"

class MainActivity : AppCompatActivity() {

    private var isLoggedIn = false
    private var loggedInUser = ""

    private val submitButton: Button
    get() = findViewById(R.id.submit_button)

    private val userName: EditText
    get() = findViewById(R.id.username)

    private val password: EditText
    get() = findViewById(R.id.password)

    private val header: TextView
    get() = findViewById(R.id.title_header)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        submitButton.setOnClickListener(){
            val userNameForm = userName.text.toString().trim()
            val passwordForm = password.text.toString().trim()

            hideKeyboard()

            if (userNameForm.isNotEmpty() && passwordForm.isNotEmpty()){

                // SET THE NAME OF THE ACTIVITY TO LAUNCH
                Intent(this, MainActivity::class.java).also {
                    loginIntent ->
                    // ADD THE DATA
                    loginIntent.putExtra(USER_NAME_KEY, userNameForm)
                    loginIntent.putExtra(PASSWORD_KEY, passwordForm)

                    // LAUNCH
                    startActivity(loginIntent)
                }
            } else {
                val toast = Toast.makeText(this, getString(R.string.login_form_entry_error), Toast.LENGTH_LONG)
                toast.setGravity(Gravity.CENTER, 0, 0)
                toast.show()
            }
        }
    }

    // MEMBUAT FUNCTION HIDE KEYBOARD
    private fun hideKeyboard(){
        if (currentFocus != null){
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager

            imm.hideSoftInputFromWindow(currentFocus?.windowToken, 0)
        }
    }

}