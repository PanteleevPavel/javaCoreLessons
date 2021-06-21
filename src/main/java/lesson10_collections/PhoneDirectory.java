package lesson10_collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class PhoneDirectory {
    private final HashMap<String, HashSet<String>> phoneDirectory = new HashMap<>();

    public void add(String name, String phone) {
        if (phoneDirectory.containsKey(name)) {
            phoneDirectory.get(name).add(phone);
        } else {
            HashSet<String> receivedNumber = new HashSet<>(Collections.singleton(phone));
            phoneDirectory.put(name, receivedNumber);
        }
    }

    public void get(String name) {
        System.out.println(phoneDirectory.get(name));
    }
}