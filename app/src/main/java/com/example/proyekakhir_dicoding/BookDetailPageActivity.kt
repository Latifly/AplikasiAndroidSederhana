package com.example.proyekakhir_dicoding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.proyekakhir_dicoding.R.id.action_share


class BookDetailPageActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_BOOK = "extra_book"
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_detail_page)

        supportActionBar?.title = "Details"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val book = intent.getParcelableExtra<Book>(EXTRA_BOOK) as Book

        val ivCover: ImageView = findViewById(R.id.iv_detailCover)
        val tvName:TextView = findViewById(R.id.tv_detailTitle)
        val tvAuthor: TextView = findViewById(R.id.tv_detailAuthor)
        val tvPublished: TextView = findViewById(R.id.tv_detailPublished)
        val tvGenre: TextView = findViewById(R.id.tv_detailGenre)
        val tvSynopsis: TextView = findViewById(R.id.tv_detailSynopsis)

        Glide.with(this)
            .load(book.cover)
            .into(ivCover)

        tvName.text = book.name
        tvAuthor.text = book.author
        tvPublished.text = book.publishedYear.toString()
        tvGenre.text = book.genre
        tvSynopsis.text = book.synopsis
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.action_share, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.action_share ->{
                Toast.makeText(this, "Buku Dibagikan", Toast.LENGTH_SHORT).show()
            }

        }
        return super.onOptionsItemSelected(item)
    }
}