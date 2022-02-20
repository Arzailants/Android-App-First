package com.blackspring.book_1_android_app_first

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class GoogleShowActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_google_show)

        val webView = WebView(this)

        webView.settings.javaScriptEnabled = true
        setContentView(webView)
        webView.loadUrl("https://www.google.com")
    }
}