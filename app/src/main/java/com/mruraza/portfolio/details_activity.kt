package com.mruraza.portfolio

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class details_activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        var fb = findViewById<ImageView>(R.id.fb)
        var insta = findViewById<ImageView>(R.id.isnta)
        var git = findViewById<ImageView>(R.id.github)
        var linkedin = findViewById<ImageView>(R.id.linedinpp)

        fb.setOnClickListener(){
            val facebookProfileUrl = "https://www.facebook.com/mrupadhyau"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(facebookProfileUrl))
            startActivity(intent)
        }
        insta.setOnClickListener(){
            val facebookProfileUrl = "https://www.instagram.com/mr.ment0z/"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(facebookProfileUrl))
            startActivity(intent)
        }
        git.setOnClickListener(){
            val facebookProfileUrl = "https://github.com/MENT0Z"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(facebookProfileUrl))
            startActivity(intent)
        }
        linkedin.setOnClickListener(){
            val facebookProfileUrl = "https://www.linkedin.com/in/madan-raj-upadhyay-18b869227/"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(facebookProfileUrl))
            startActivity(intent)
        }

    }
}