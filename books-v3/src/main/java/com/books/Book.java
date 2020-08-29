package com.books;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    private String title;
    private String name;
    private String description;
    private Date createAt;
    private String version;

}
