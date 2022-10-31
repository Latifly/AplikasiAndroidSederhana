package com.example.proyekakhir_dicoding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.proyekakhir_dicoding.R.id.action_about

class MainActivity : AppCompatActivity() {

    private lateinit var rvBook: RecyclerView
    private var list: ArrayList<Book> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvBook = findViewById(R.id.rv_list_book)
        rvBook.setHasFixedSize(true)


        list.addAll(BookData.BookListData)
        showRecyclerView()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.action_button, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_about -> {
                val moveIntent = Intent(this@MainActivity, AboutPage::class.java)
                startActivity(moveIntent)
            }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun showRecyclerView(){
        rvBook.layoutManager = LinearLayoutManager(this)
        val cardViewAdapter = CardViewBookAdapter(list)
        rvBook.adapter = cardViewAdapter
    }
}