package com.chen.peter.kotlinpractice

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView

class KHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView){
    var textView: TextView

    init {
        textView = ItemView.findViewById(R.id.testViewHolder)
    }

    fun bind(text: String){
        textView.setText(text)
    }
}