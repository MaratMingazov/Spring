package org.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import java.util.List;


public class BooksDAO {

    @Autowired private MongoOperations mongoOperations;

    public List<Book> getAllBooks() {
        return mongoOperations.findAll(Book.class);
    }

    public void saveBook(Book book) {
        mongoOperations.save(book);
    }
}
