package com.example.intents_sean

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import java.net.URI

class MainActivity : AppCompatActivity() {
    lateinit var btnSms:Button
    lateinit var btnEmail:Button
    lateinit var btnCamera:Button
    lateinit var btnShare:Button
    lateinit var btnMpesa:Button
    lateinit var btnCall:Button
    lateinit var btnWebsite:Button
    lateinit var btnMap:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSms = findViewById(R.id.btnsms)
        btnEmail = findViewById(R.id.btnemail)
        btnCamera = findViewById(R.id.btncamera)
        btnShare = findViewById(R.id.btnshare)
        btnMpesa = findViewById(R.id.btnmpesa)
        btnCall = findViewById(R.id.btncall)
        btnWebsite= findViewById(R.id.btnwebsite)
        btnMap = findViewById(R.id.btnmap)

        btnSms.setOnClickListener{
            var uri:Uri = Uri.parse("smsto:072050044")
            val intent = Intent(Intent.ACTION_SENDTO,uri)
            intent.putExtra("sms_body","SEAN IS AMAZING")
            startActivity(intent)




        }
        btnEmail.setOnClickListener{
            var emailIntent = Intent(Intent.ACTION_SENDTO, Uri.fromParts("mail to","seangithaiga@gmail.com",null))
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "JOB APPLICATION")
            emailIntent.putExtra(Intent.EXTRA_TEXT, "Dear Sir.......")
            startActivity(Intent.createChooser(emailIntent,"Send Email"))
        }

        btnCamera.setOnClickListener{
            val takePictureIntent =Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(takePictureIntent, 1)
        }

        btnMpesa.setOnClickListener{
            val simToolkitIntent = applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolkitIntent?.let {
                startActivity(it)
            }
        }



        btnWebsite.setOnClickListener{
            //code to navigate one activity to another
            val gotoanotheractivity =Intent(this,website_activity::class.java)
            startActivity(gotoanotheractivity)
        }






    }
}