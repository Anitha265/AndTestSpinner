package com.example.loginscreen

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class ListActivity: AppCompatActivity() {

//   lateinit var  myDataObj : MyData
    var id: Int = 0
    var name:String = ""
    var mobile: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.row)

        var serialNumber = findViewById<TextView>(R.id.serialNumber)
        var studentName = findViewById<TextView>(R.id.studentName)
        var mobileNumber = findViewById<TextView>(R.id.mobileNum)
         intent = getIntent()

        if(intent != null) {
             id = intent.getIntExtra("num",0)
            name = intent.getStringExtra("name")
            mobile = intent.getStringExtra("mobileNumber")

            serialNumber.setText("" +id)
            studentName.setText(name)
            mobileNumber.setText(mobile)

        }

    }
}