package com.example.proyekakhir_dicoding

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class CardViewBookAdapter(private val listBook: ArrayList<Book>) :
    RecyclerView.Adapter<CardViewBookAdapter.CardViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CardViewBookAdapter.CardViewHolder {

        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.book_card, parent, false)
        return CardViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewBookAdapter.CardViewHolder, position: Int) {
        val book = listBook[position]

        Glide.with(holder.itemView.context)
            .load(book.cover)
            .apply(RequestOptions().override(350, 550))
            .into(holder.ivCover)

        holder.tvName.text = book.name
        holder.tvAuthor.text = book.author

    }

    override fun getItemCount(): Int {
        return listBook.size
    }

    inner class CardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var ivCover: ImageView = itemView.findViewById(R.id.iv_bookPhoto)
        var tvName: TextView = itemView.findViewById(R.id.tv_bookName)
        var tvAuthor: TextView = itemView.findViewById(R.id.tv_bookAuthor)
    }

}