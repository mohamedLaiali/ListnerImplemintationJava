package com.demo1;

import java.util.List;

public class Child extends Parent{
    public Child() {
        super();
    }

    public Parent getParent() {
        return  super.getParent();
    }

    public List<String> getList() {
        return super.getList();
    }
}
