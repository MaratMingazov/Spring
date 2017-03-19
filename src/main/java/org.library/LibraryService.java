package org.library;


import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LibraryService {

    @Autowired private BooksDAO booksDAO;

    public void addBook(String author, String title) {
        Book book = new Book(author, title);
        booksDAO.saveBook(book);
    }

    public List<Book> getBooksList() {
        return booksDAO.getAllBooks();
    }
}
