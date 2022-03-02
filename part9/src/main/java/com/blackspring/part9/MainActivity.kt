package com.blackspring.part9

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View


const val STAR_SIGN_ID = "STAR_SIGN_ID"

// MEMBUAT INTERFACE
interface StarSignListener {
    fun onSelected(id: Int)
}

class MainActivity : AppCompatActivity(), StarSignListener {

    //
    var isDualPanel: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        isDualPanel = findViewById<View>(R.id.star_sign_detail) != null

    }

    override fun onSelected(id: Int) {
        if (isDualPanel) {
            val detailFragment = supportFragmentManager
                .findFragmentById(R.id.star_sign_detail) as DetailFragment
            detailFragment.setStarSignData(id)
        } else {
            val detailIntent = Intent(this, DetailFragment::class.java).apply {
                putExtra(STAR_SIGN_ID, id)
            }
            startActivity(detailIntent)
        }
    }
}



