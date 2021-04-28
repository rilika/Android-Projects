package com.example.library

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.library.R
import android.content.Intent
import android.view.View
import android.widget.Button
import com.example.library.AllBooks

class MainActivity : AppCompatActivity() {
    private lateinit var seeAllBooks: Button
    private lateinit var currentlyReadingBooks: Button
    private lateinit var alreadyReadBooks: Button
    private lateinit var wantToRead: Button
    private lateinit var favourites: Button
    private lateinit var about: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        seeAllBooks = findViewById(R.id.seeAllBooks)
        currentlyReadingBooks = findViewById(R.id.currentlyReadingBooks)
        alreadyReadBooks = findViewById(R.id.alreadyReadBooks)
        wantToRead = findViewById(R.id.wantToRead)
        favourites = findViewById(R.id.favourites)
        about = findViewById(R.id.about)


        seeAllBooks.setOnClickListener {
            intent=Intent(this@MainActivity,AllBooks::class.java)
            startActivity(intent)
        }
    }
}