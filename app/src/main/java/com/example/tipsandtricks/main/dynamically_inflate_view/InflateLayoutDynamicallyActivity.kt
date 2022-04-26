package com.example.tipsandtricks.main.dynamically_inflate_view

import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.tipsandtricks.R


class InflateLayoutDynamicallyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inflate_layout_dynamically)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)
    }

    override fun onResume() {
        super.onResume()
        val linearLayout= findViewById<LinearLayout>(R.id.linearLayout)


        for(i in 1..10) {
            val customView = CustomView(this)
            customView.addText("Custom Text $i")
            linearLayout.addView(customView)
        }

        // Dynamically inflate view and add it to the linear layout
        val customViewImage: View = layoutInflater.inflate(R.layout.custom_view_image_layout, null)
        linearLayout.addView(customViewImage)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}