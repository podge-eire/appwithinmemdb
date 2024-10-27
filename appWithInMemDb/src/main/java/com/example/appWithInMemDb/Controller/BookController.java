package com.example.appWithInMemDb.Controller;

import com.example.appWithInMemDb.Entity.Book;
import com.example.appWithInMemDb.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/v1")
public class BookController {

 @Autowired
 BookService bookService;


    @GetMapping("/findAll")
    public List<Book> findAllBooks(){

        return bookService.returnAllBooks();
    }


}
