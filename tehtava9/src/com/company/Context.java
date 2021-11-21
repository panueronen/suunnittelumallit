package com.company;

import java.util.ArrayList;

public class Context {
    private ListConverter converter;

    public Context(ListConverter converter) {
        this.converter = converter;
    }

    public void setConverter(ListConverter converter) {
        this.converter = converter;
    }

    public String convert(ArrayList<String> list) {
        return converter.listToString(list);
    }
}
