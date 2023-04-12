package com.example.intents_sean

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class absawebsite : AppCompatActivity() {
    private  lateinit var absaweb:WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_absawebsite)
        absaweb=findViewById(R.id.absabnk)
        var web_settings=absaweb.settings
        web_settings.javaScriptEnabled= true
        absaweb.loadUrl("https://pinterest.com")

    }
}