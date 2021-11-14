package com.example.loginscreen

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.ActionBar
import android.util.Patterns
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        var et_email = findViewById<EditText>(R.id.et_email)
        var et_pswd = findViewById<EditText>(R.id.et_pswd)
        var btn_submit = findViewById<Button>(R.id.btn_submit)
      //  var emailToText = findViewById<Button>(R.id.btn_submit)

        btn_submit.setOnClickListener {
            val intent = Intent(applicationContext, MainActivity2::class.java )
            startActivity(intent)

         /*  if(et_email.length() == 0) {
            Toast.makeText(this, "Email Required",Toast.LENGTH_SHORT).show()
             return@setOnClickListener
            }
            if(et_pswd.length() == 0) {
                Toast.makeText(this , "Pswd Required",Toast.LENGTH_SHORT).show()
             return@setOnClickListener
            }*/
          /* if (!et_email.toString().trim().isEmpty() && Patterns.EMAIL_ADDRESS.matcher(et_email.toString().trim()).matches()) {
                Toast.makeText(this, "Email Verified !", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Enter valid Email address !", Toast.LENGTH_SHORT).show();
            }*/

        }

    }
}