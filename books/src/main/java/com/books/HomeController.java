package com.books;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "api/")
public class HomeController {

    @GetMapping("/books")
    public ResponseEntity<List<Books>> getMyBooks() {
        List<Books> books = new ArrayList<>();
        books.add(new Books("Book1", "DC1", "v1.0"));
        books.add(new Books("Book2", "DC2", "v1.0"));
        books.add(new Books("Book3", "MV1", "v1.0"));
        books.add(new Books("Book4", "MV2", "v1.0"));

        return ResponseEntity.ok(books);
    }

}

