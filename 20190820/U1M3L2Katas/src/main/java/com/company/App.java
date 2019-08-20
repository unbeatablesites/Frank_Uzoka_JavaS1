package com.company;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App {



    public static void printValues() {
        Map<String, String> printValues = new HashMap<>();

        Collection<String> myValues = printValues.values();
        for (String value : myValues) System.out.println(value);

    }

    public void printKeys(HashMap<String, String> test1) {
        Map<String, String> printKeys = new HashMap<>();

// Creating Map entries
//        printKeys.put("Joe", "Joe");
//        printKeys.put("Jane", "Joe");
//        printKeys.put("Sally", "Joe");


        Set<String> myKeys = printKeys.keySet();
        for (String key : myKeys) {
            System.out.println(key);
        }
    }
}


//    public static void printKeysAndValues() {
//
//        Set<Map.Entry<String, String>> myEntries = printKeys.entrySet();
//
//
//    }
//
//}
