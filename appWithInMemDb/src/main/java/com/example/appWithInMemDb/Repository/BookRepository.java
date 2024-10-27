package com.example.appWithInMemDb.Repository;

import com.example.appWithInMemDb.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
