package com.books;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/ping")
    public ResponseEntity<String> getMyBook() {
        return ResponseEntity.ok("pong v3");
    }

}

