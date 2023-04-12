package com.example.intents_sean

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class simplewebviewapp : AppCompatActivity() {
    lateinit var btnabsa:Button
    lateinit var btnkcb:Button
    lateinit var btnequty:Button
    lateinit var btnchase:Button
    lateinit var btncooperative:Button
    lateinit var btncba:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simplewebviewapp)

        btnabsa = findViewById(R.id.absabnk)
        btnkcb = findViewById(R.id.kcbbnk)
        btnequty= findViewById(R.id.equitybnk)
        btnchase = findViewById(R.id.chasebnk)
        btncooperative = findViewById(R.id.cooperativebnk)
        btncba = findViewById(R.id.cbabnk)



        btnabsa.setOnClickListener{
            //code to navigate one activity to another
            val gotoanotheractivity = Intent(this,absawebsite::class.java)
            startActivity(gotoanotheractivity)
        }




    }



}