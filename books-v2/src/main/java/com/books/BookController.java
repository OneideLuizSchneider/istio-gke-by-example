package com.books;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "api/")
public class BookController {

    @GetMapping("/books")
    public ResponseEntity<List<Book>> getMyBook() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("book1","DC1",new Date(),"v2.0"));
        books.add(new Book("book2","DC2",new Date(),"v2.0"));
        books.add(new Book("book3","MARVEL1",new Date(),"v2.0"));
        books.add(new Book("book4","MARVEL2",new Date(),"v2.0"));
        books.add(new Book("book5","MARVEL3",new Date(),"v2.0"));
        books.add(new Book("book6","DC3",new Date(),"v2.0"));
        books.add(new Book("book7","DC4",new Date(),"v2.0"));
        books.add(new Book("book8","DC5",new Date(),"v2.0"));
        books.add(new Book("book9","MARVEL4",new Date(),"v2.0"));
        books.add(new Book("book10","MARVEL5",new Date(),"v2.0"));

        return ResponseEntity.ok(books);
    }

}

