package com.example.loginscreen

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class ListActivity: AppCompatActivity() {

    var id: Int = 0
    var name:String = ""
    var mobile: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.row)

        var serialNumber = findViewById<TextView>(R.id.id)
        var studentName = findViewById<TextView>(R.id.name)
        var mobileNumber = findViewById<TextView>(R.id.mobile)

          id = intent.getIntExtra("num",0)
          name =   intent.getStringExtra("name").toString()
         mobile = intent.getStringExtra("mobile").toString()

            serialNumber.setText("" +id)
            studentName.setText(name)
            mobileNumber.setText(mobile)

        }
}