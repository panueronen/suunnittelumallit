package com.company;

import java.util.ArrayList;

public class AfterEachStrategy implements ListConverter {
    @Override
    public String listToString(ArrayList<String> list) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            builder.append(list.get(i)).append(",");
            builder.append("\n");
        }
        System.out.println("This is after each");
        return builder.toString();
    }
}
