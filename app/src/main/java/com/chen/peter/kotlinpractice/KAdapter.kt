package com.chen.peter.kotlinpractice

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import java.util.ArrayList


open class KAdapter : RecyclerView.Adapter<KHolder> {

    var list:ArrayList<String>

    constructor(list:ArrayList<String>) : super(){
        this.list = list
    }

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): KHolder {
        var inflater: LayoutInflater =
                parent.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        return KHolder(inflater.inflate(R.layout.holder,parent,false))
    }

    override fun onBindViewHolder(holder: KHolder, position: Int) {
        holder.bind(list.get(position))
    }

    override fun getItemCount(): Int {
        return list.size
    }
}