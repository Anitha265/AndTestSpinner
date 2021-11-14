package com.example.loginscreen

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class MyAdapter(val context: Context,val arrayList: java.util.ArrayList<MyData>)
    : BaseAdapter() {
     lateinit var id: TextView
     lateinit var name: TextView
     lateinit var mobile: TextView
    override fun getCount(): Int {
        return arrayList.size
    }
    override fun getItem(position: Int): Any {
        return position
    }
    override fun getItemId(position: Int): Long {
        return position.toLong()
    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View? {
        var convertView = convertView
        convertView = LayoutInflater.from(context).inflate(R.layout.row, parent, false)
        id = convertView!!.findViewById(R.id.id)
        name = convertView.findViewById(R.id.name)
        mobile = convertView.findViewById(R.id.mobile)
        id.text = " " + arrayList[position].num
        name.text = arrayList[position].name
        mobile.text = arrayList[position].mobileNumber
        return convertView
    }
}