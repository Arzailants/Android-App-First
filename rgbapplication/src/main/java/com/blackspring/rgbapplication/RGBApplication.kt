package com.blackspring.rgbapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class RGBApplication : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rgb_application)

        findViewById<MaterialButton>(R.id.material_button)?.setOnClickListener(){

            // MENDAPATKAN ID RED CHANNEL
            var redChannel = findViewById<TextInputEditText>(R.id.red_channel).text.toString()
            var greenChannel = findViewById<TextInputEditText>(R.id.green_channel).text.toString()
            var blueChannel = findViewById<TextInputEditText>(R.id.blue_channel).text.toString()

            // CHECK THAT ALL FIELDS ARE FILLED IN
            // AND SHOW ERROR MESSAGE IF NOT.
            if (redChannel.isEmpty() or greenChannel.isEmpty() or blueChannel.isEmpty()){
                Toast.makeText(this, "All value are Required", Toast.LENGTH_LONG).show()
            } else {
                // CHECK THAT 2 HEXADECIMAL CHARACTERS
                // HAVE BEEN ENTERED AND IF NOT
                // ADD THE SAME HEXADECIMAL CHARACTER AGAIN.
                if (redChannel.length == 1) redChannel = redChannel.plus(redChannel)
                if (greenChannel.length == 1) greenChannel = greenChannel.plus(greenChannel)
                if (blueChannel.length == 1) blueChannel = blueChannel.plus(blueChannel)

                val colorToDisplay = redChannel.plus(greenChannel).plus(blueChannel)

                val colorAsInt = Color.parseColor("#".plus(colorToDisplay))
                findViewById<TextView>(R.id.text_view_rgb_view)?.setBackgroundColor(colorAsInt)
            }
        }
    }
}