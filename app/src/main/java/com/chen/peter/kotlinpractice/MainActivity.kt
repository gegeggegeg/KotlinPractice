package com.chen.peter.kotlinpractice

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
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
            R.id.about->{
                val channel1 = NotificationChannel("channelid","channelname",NotificationManager.IMPORTANCE_LOW)
                val manager :NotificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
                manager.createNotificationChannel(channel1)
                val notification = Notification.Builder(this,"channelid").
                        setContentTitle("Test Notification").
                        setContentText("Hello Kotlin!!").
                        setSmallIcon(R.drawable.ic_notification).
                        build()
                manager.createNotificationChannel(channel1)
                manager.notify(1234,notification)
            }
        }
        return true
    }

}
