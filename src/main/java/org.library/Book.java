package org.spr;

import org.springframework.data.annotation.Id;



public class Book {


    @Id
    private  String id;
    private String ISBN;
    private String Authors;
    private int numberOfPages;
    private String title;


}
