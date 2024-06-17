package com.demo1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Create a Person object

        Items tomatoes = new Items("Tomatoes");
        Stock stock = new Stock();
        tomatoes.addPropertyChangeListener(stock);
        tomatoes.setName("Tomatoes");


    }
}
