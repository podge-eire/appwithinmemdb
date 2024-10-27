package com.example.appWithInMemDb.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jdk.jfr.DataAmount;
import jdk.jfr.Label;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Book {

    @Id
    private int bookId;
    @Column
    private String title;
    @Column
    private String author;



}
