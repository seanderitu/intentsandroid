package com.example.intents_sean

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class website_activity : AppCompatActivity() {
    private lateinit var myweb:WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_website)
        myweb=findViewById(R.id.Mweb)
        var web_settings=myweb.settings
        web_settings.javaScriptEnabled= true
        myweb.loadUrl("https://pinterest.com")



    }
}