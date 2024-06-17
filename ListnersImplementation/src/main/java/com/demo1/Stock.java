package com.demo1;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Stock implements PropertyChangeListener {
    @Override
    public void propertyChange(PropertyChangeEvent evt) {

        System.out.println("Stock added new value : " + evt.getNewValue());
    }
}
