package com.demo1;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Items {
    private String name;
    private final PropertyChangeSupport support;

    public Items(String name) {
        this.name = name;
        support = new PropertyChangeSupport(this);
    }

    public void setName(String name) {

        this.name = name;
        support.firePropertyChange("name", null, name);

    }

    public String getName() {
        return name;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        support.removePropertyChangeListener(listener);
    }
}
