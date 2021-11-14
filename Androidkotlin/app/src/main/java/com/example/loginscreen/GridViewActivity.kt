package com.example.loginscreen

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView

class GridViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid_view)

        var grid_view = findViewById<GridView>(R.id.grid_view)


    }
}