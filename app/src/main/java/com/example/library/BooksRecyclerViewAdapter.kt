package com.example.library

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import java.util.*

class BooksRecyclerViewAdapter(private val context: Context) : RecyclerView.Adapter<BooksRecyclerViewAdapter.ViewHolder>() {
    private var books = ArrayList<Book>()
    fun setBooks(books: ArrayList<Book>) {
        this.books = books
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.book_list_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bookName.text = books[position].bookName
        Glide.with(context)
                .asBitmap()
                .load(books[position].imageURL)
                .into(holder.bookImage)
        holder.parent.setOnClickListener { Toast.makeText(context, books[position].bookName + " selected", Toast.LENGTH_SHORT).show() }
    }

    override fun getItemCount(): Int {
        return books.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val parent: CardView
        val bookImage: ImageView
         val bookName: TextView

        init {
            parent = itemView.findViewById(R.id.parent)
            bookImage = itemView.findViewById(R.id.bookImage)
            bookName = itemView.findViewById(R.id.bookName)
        }
    }
}