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
        var kAdapter:KAdapter = KAdapter(list)
        var linearLayout : LinearLayoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = linearLayout
        recyclerView.adapter = (kAdapter)
    }

    fun initList(){
        list.add("apple")
        list.add("boar")
        list.add("cat")
        list.add("dog")
        list.add("elephant")
        list.add("frog")
        list.add("goat")
        list.add("hen")
        list.add("in")
        list.add("joke")
        list.add("king")
    }
}