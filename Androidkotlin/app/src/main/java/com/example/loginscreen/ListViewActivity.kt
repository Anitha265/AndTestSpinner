package com.example.loginscreen

import android.app.ActionBar
import android.app.ActionBar.DISPLAY_SHOW_CUSTOM
import android.content.Intent
import android.graphics.Typeface
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.view.Gravity
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.TextView

class ListViewActivity : AppCompatActivity() {

    val num: Int = 1
    val name:String = "Mashu"
    val mobileNumber = "987576443"

    lateinit var listView: ListView
    var arrayList: ArrayList<MyData> = ArrayList()
    lateinit var adapter: MyAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

//        supportActionBar?.apply {
//            // show custom title in action bar
//            customView = actionBarCustomTitle()
//            displayOptions = DISPLAY_SHOW_CUSTOM
//
//            setDisplayShowHomeEnabled(true)
//            setDisplayUseLogoEnabled(true)
//        }
                title = "KotlinApp"
                listView = findViewById(R.id.listView)
                arrayList.add(MyData(1, " Mashu", "987576443"))
                arrayList.add(MyData(2, " Azhar", "8787576768"))
                arrayList.add(MyData(3, " Niyaz", "65757657657"))
                adapter = MyAdapter(this, arrayList)
                listView.adapter = adapter

        listView.setOnItemClickListener(AdapterView.OnItemClickListener() {
                adapterView: AdapterView<*>, view1: View, i: Int, l: Long ->
                 val intent = Intent(this,ListActivity::class.java)
            intent.putExtra("num",num)
            intent.putExtra("name", name)
            intent.putExtra("mobileNumber",mobileNumber)

            startActivity(intent)
        })


        }

            }
 class MyData(
     var num: Int,
     var name: String,
     var mobileNumber: String)

//fun actionBarCustomTitle(): TextView {
//    return TextView(this).apply {
//        text = "ActionBar Center Title"
//
//        val params = ActionBar.LayoutParams(
//            ActionBar.LayoutParams.WRAP_CONTENT,
//            ActionBar.LayoutParams.WRAP_CONTENT
//        )
//        // center align the text view/ action bar title
//        params.gravity = Gravity.CENTER_HORIZONTAL
//        layoutParams = params
//
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
//            setTextAppearance(
//                android.R.style.TextAppearance_Material_Widget_ActionBar_Title
//            )
//        } else {
//            // define your own text style
//            setTextSize(TypedValue.COMPLEX_UNIT_SP, 17F)
//            setTypeface(null, Typeface.BOLD)
//        }
//    }