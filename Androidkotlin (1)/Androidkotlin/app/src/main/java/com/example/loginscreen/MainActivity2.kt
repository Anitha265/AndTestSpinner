package com.example.loginscreen

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity2 : AppCompatActivity(),AdapterView.OnItemSelectedListener {

    var colors = arrayOf("Red" , "Green" , "Blue" , "Orange")
    lateinit var textView_msg:TextView
    lateinit var spinner_sample:Spinner
    lateinit var redCheckBox:CheckBox
    lateinit var greenCheckBox:CheckBox
    lateinit var blueCheckBox:CheckBox
    lateinit var orangeCheckBox:CheckBox

      override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

         textView_msg = findViewById<TextView>(R.id.text_view)
         spinner_sample = findViewById<Spinner>(R.id.spinner)
//        redCheckBox = findViewById<CheckBox>(R.id.redCheckBox)
//        greenCheckBox = findViewById<CheckBox>(R.id.greenCheckBox)
//        blueCheckBox = findViewById<CheckBox>(R.id.blueCheckBox)
//        orangeCheckBox = findViewById<CheckBox>(R.id.orangeCheckBox)
        spinner_sample.adapter = ArrayAdapter(this,android.R.layout.simple_spinner_item,colors)

        spinner_sample.setOnItemSelectedListener(this)

        }

    override fun onItemSelected(arg0: AdapterView<*>, arg1: View, position: Int, id: Long) {
        textView_msg.text = "Selected : "+colors[position]
    }

    override fun onNothingSelected(arg0: AdapterView<*>) {

    }

}