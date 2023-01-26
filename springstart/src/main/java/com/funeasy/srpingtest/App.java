package com.funeasy.srpingtest;

import com.funeasy.srpingtest.service.BookServieImpl;

public class App {
    public static void main(String[] args) {
        BookServieImpl servie = new BookServieImpl();
        servie.save();
    }
}
