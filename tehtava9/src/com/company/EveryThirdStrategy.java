package com.company;

import java.util.ArrayList;

public class EveryThirdStrategy implements ListConverter {
    @Override
    public String listToString(ArrayList<String> list) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            builder.append(list.get(i)).append(",");
            if ((i + 1) % 3 == 0) {
                builder.append("\n");
            }
        }
        System.out.println("This is every third strategy");
        return builder.toString();
    }
}
