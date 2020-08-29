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
        books.add(new Book("Batman1","book1","DC1",new Date(), "v3.0"));
        books.add(new Book("Batman2","book2","DC2",new Date(),"v3.0"));
        books.add(new Book("IronMan1","book3","MARVEL1",new Date(),"v3.0"));
        books.add(new Book("IronMan2","book4","MARVEL2",new Date(),"v3.0"));
        books.add(new Book("IronMan3","book5","MARVEL3",new Date(),"v3.0"));
        books.add(new Book("Superman1","book6","DC3",new Date(),"v3.0"));
        books.add(new Book("Superman2","book7","DC4",new Date(),"v3.0"));
        books.add(new Book("StarWars-I","book9","LF1",new Date(),"v3.0"));
        books.add(new Book("StarWars-II","book10","LF2",new Date(),"v3.0"));
        books.add(new Book("StarWars-III","book11","LF3",new Date(),"v3.0"));
        books.add(new Book("StarWars-IV","book12","LF4",new Date(),"v3.0"));
        books.add(new Book("StarWars-V","book13","LF5",new Date(),"v3.0"));
        books.add(new Book("StarWars-VI","book14","LF6",new Date(),"v3.0"));
        books.add(new Book("StarWars-VII","book15","LF7",new Date(),"v3.0"));
        books.add(new Book("StarWars-VIII","book16","LF8",new Date(),"v3.0"));
        books.add(new Book("StarWars-IX","book17","LF9",new Date(),"v3.0"));

        return ResponseEntity.ok(books);
    }

}

