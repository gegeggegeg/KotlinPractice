package com.chen.peter.kotlinpractice

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class RecyclerActivity: AppCompatActivity() {

    var list: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)
        initList()
        var recyclerView : RecyclerView = findViewById(R.id.recycler)
        recyclerView.layoutManager = object :LinearLayoutManager(this){}
        recyclerView.adapter = object : KAdapter(list){}
    }

    fun initList(){
        for(number in 1..20){
            list.add(number.toString())
        }
    }
}