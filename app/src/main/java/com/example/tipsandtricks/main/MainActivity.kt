package com.example.tipsandtricks.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import com.example.tipsandtricks.main.dynamically_inflate_view.InflateLayoutDynamicallyActivity
import com.example.tipsandtricks.R
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        val buttonInflateLayoutDynamically= findViewById<MaterialButton>(R.id.buttonInflateLayoutDynamically)


        buttonInflateLayoutDynamically.setOnClickListener{
            val intent = Intent(this, InflateLayoutDynamicallyActivity::class.java)
            startActivity(intent)
        }
    }
}