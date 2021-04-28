package com.example.library

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class AllBooks : AppCompatActivity() {
    lateinit var allBooksRecyclerView:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_all_books)
         allBooksRecyclerView= findViewById(R.id.allBooksRecyclerView)
        val adapter = BooksRecyclerViewAdapter(this)
        allBooksRecyclerView.adapter = adapter
        allBooksRecyclerView.layoutManager = LinearLayoutManager(this)
        val books = ArrayList<Book>()
        books.add(Book(1, "Da Vinci Code", "Dan Brown", "Da Vinci Code by Dan Brown", "Da Vinci Code by Dan Brown", "https://www.tutorialspoint.com/images/tp-logo-diamond.png"))
        books.add(Book(1, "Da Vinci Code", "Dan Brown", "Da Vinci Code by Dan Brown", "Da Vinci Code by Dan Brown", "https://www.tutorialspoint.com/images/tp-logo-diamond.png"))
        books.add(Book(1, "Da Vinci Code", "Dan Brown", "Da Vinci Code by Dan Brown", "Da Vinci Code by Dan Brown", "https://www.tutorialspoint.com/images/tp-logo-diamond.png"))
        books.add(Book(1, "Da Vinci Code", "Dan Brown", "Da Vinci Code by Dan Brown", "Da Vinci Code by Dan Brown", "https://www.tutorialspoint.com/images/tp-logo-diamond.png"))
        books.add(Book(1, "Da Vinci Code", "Dan Brown", "Da Vinci Code by Dan Brown", "Da Vinci Code by Dan Brown", "https://www.tutorialspoint.com/images/tp-logo-diamond.png"))
        adapter.setBooks(books)
    }
}