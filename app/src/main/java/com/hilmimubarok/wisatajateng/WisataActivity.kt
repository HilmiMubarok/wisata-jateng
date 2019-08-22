package com.hilmimubarok.wisatajateng

import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.ActionBar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class WisataActivity : AppCompatActivity() {

    private lateinit var rvWisata: RecyclerView
    private var list: ArrayList<Wisata> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wisata)
        val title = "List Wisata"
        setActionBarTitle(title)

        rvWisata = findViewById(R.id.rv_wisata)
        rvWisata.setHasFixedSize(true)

        list.addAll(DataWisata.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvWisata.layoutManager = LinearLayoutManager(this)
        rvWisata.adapter = ListWisataAdapter(list)
    }

    fun setActionBarTitle(title: String) {
        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = title
            (supportActionBar as ActionBar).setBackgroundDrawable(ColorDrawable(resources.getColor(R.color.statusWisata)))
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_wisata, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }
    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_list -> {
            }
            R.id.action_grid -> {
            }
            R.id.action_cardview -> {
            }
        }
    }
}
