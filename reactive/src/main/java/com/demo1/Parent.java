package com.demo1;

import java.util.ArrayList;
import java.util.List;

public class Parent {


    private final List<String > list ;

    public Parent() {
        this.list = new ArrayList<>();
    }

    public Parent getParent() {

        return this;
    }

    public void add(String name ){
        list.add(name);

    }

    public List<String> getList() {
        return list;
    }
}
