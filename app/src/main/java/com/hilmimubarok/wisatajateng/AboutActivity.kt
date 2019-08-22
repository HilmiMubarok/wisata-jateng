package com.hilmimubarok.wisatajateng

import android.content.Intent
import android.graphics.drawable.ColorDrawable
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.ActionBar


class AboutActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View) {
        when(v.id) {
            R.id.btn_fb -> {
                web_page_open("https://www.facebook.com/moh.hilmi.mubarok")
            }

            R.id.btn_ig -> {
                web_page_open("https://www.instagram.com/m.hilmimubarok")
            }

            R.id.btn_li -> {
                web_page_open("https://id.linkedin.com/in/mohammad-hilmi-mubarok-77b677150")
            }
        }
    }


    fun web_page_open(urls: String) { // for more than one url
        val uris = Uri.parse(urls)
        val intents = Intent(Intent.ACTION_VIEW, uris)
        startActivity(intents)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val title = "About Aplikasi"
        setActionBarTitle(title)

//        Button Facebook
        val btnFb : Button = findViewById(R.id.btn_fb)
        btnFb.setOnClickListener(this)

//        Button Instagram
        val btnIg : Button = findViewById(R.id.btn_ig)
        btnIg.setOnClickListener(this)

//        Button LinkedIn
        val btnLi : Button = findViewById(R.id.btn_li)
        btnLi.setOnClickListener(this)

//        Button Download
        val btnDownload : Button = findViewById(R.id.download)
        btnDownload.setOnClickListener(this)
    }

    fun setActionBarTitle(title: String) {
        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = title
            (supportActionBar as ActionBar).setBackgroundDrawable(ColorDrawable(resources.getColor(R.color.statusAbout)))
        }
    }
}
