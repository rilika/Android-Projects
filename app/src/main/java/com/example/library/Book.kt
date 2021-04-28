package com.example.library

class Book(var bookId: Int, var bookName: String, var author: String, var shortDesc: String, var longDesc: String, var imageURL: String) {
    override fun toString(): String {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", shortDesc='" + shortDesc + '\'' +
                ", longDesc='" + longDesc + '\'' +
                ", imageURL='" + imageURL + '\'' +
                '}'
    }
}