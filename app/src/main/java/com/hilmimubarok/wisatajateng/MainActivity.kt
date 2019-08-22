package com.hilmimubarok.wisatajateng

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        Button Explore Now
        val btnHome: Button = findViewById(R.id.btn_home)
        btnHome.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_home -> {
                val move = Intent(this@MainActivity, WisataActivity::class.java);
                startActivity(move)
            }

        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        set(item.itemId)
        return super.onOptionsItemSelected(item)
    }

     fun set(selectedItem: Int){
        when(selectedItem){
            R.id.about_btn -> {
                val move = Intent(this@MainActivity, AboutActivity::class.java);
                startActivity(move)
            }
        }
    }

}
