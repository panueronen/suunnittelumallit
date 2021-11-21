package com.company;

import java.util.ArrayList;

public class AfterEveryotherStrategy implements ListConverter {
    @Override
    public String listToString(ArrayList<String> list) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            builder.append(list.get(i)).append(",");
            if ((i + 1) % 2 == 0) {
                builder.append("\n");
            }
        }
        System.out.println("This is every other Strategy");
        return builder.toString();
    }
}
