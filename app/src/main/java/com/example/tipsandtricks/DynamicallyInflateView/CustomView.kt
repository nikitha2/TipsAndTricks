package com.example.tipsandtricks.DynamicallyInflateView

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.TextView
import com.example.tipsandtricks.R

class CustomView : LinearLayout {
    constructor(context: Context) : this(context, null)
    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, 0)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs,
        defStyleAttr) {
        inflate(context)
    }

    private fun inflate(context: Context) {
        val inflater = context
            .getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        inflater.inflate(R.layout.custom_view_text_layout, this, true)
    }

    fun addText(textToAdd: String) {
        val customViewText=findViewById<TextView>(R.id.customViewText)
        customViewText.text=textToAdd
    }
}