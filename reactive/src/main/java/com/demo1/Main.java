package com.demo1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Child child = new Child();
        child.getParent().add("mohamed");
        child.getParent().add("aya");
        child.getParent().add("hussein");
        child.getParent().add("fareida");

        child.getList().forEach(System.out::println);

    }
}