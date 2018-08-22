package com.chen.peter.kotlinpractice

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var mtextview :TextView = findViewById(R.id.test)
        var mString: String = "Hello Kotlin"
        mtextview.setText(mString)
        var testBtn : Button = findViewById(R.id.testBtn)
        testBtn.setOnClickListener({
            view ->Toast.makeText(this,"Hello Kotlin",Toast.LENGTH_SHORT).show()});
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.options,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.list->{
                var intent:Intent = Intent();
                intent.setClass(this,RecyclerActivity::class.java)
                startActivity(intent)
            }
        }
        return true
    }

}
