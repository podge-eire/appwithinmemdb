package com.example.appWithInMemDb.Service;

import com.example.appWithInMemDb.Entity.Book;
import com.example.appWithInMemDb.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

@Autowired
    BookRepository bookRepository;


public List<Book> returnAllBooks(){

    return bookRepository.findAll();

}



}
