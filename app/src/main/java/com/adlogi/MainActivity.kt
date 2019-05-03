package com.adlogi

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import com.adlogi.insights.RestClient
import kotlinx.android.synthetic.main.activity_main.*





class MainActivity : AppCompatActivity() {
    val client = RestClient()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        
        fab.setOnClickListener {

            client.addParam("email", "Bhavsait@gmail.com")
            client.addParam("password", "2dassaada3")
            try {
                val response =
                    client.executePost() // In case your server sends any response back, it will be saved in this response string.
Log.i("check post",response)
            } catch (e: Exception) {
                e.printStackTrace()
            }



        }




    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
