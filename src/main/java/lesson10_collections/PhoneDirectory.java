package lesson10_collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class PhoneDirectory {
    private HashMap<String, HashSet<String>> phoneDirectory = new HashMap<>();

    public void add(String name, String phone) {
        HashSet<String> receivedNumber = new  HashSet<String>(Collections.singleton(phone));
        try {
            phoneDirectory.get(name).add(phone);
        } catch (Exception e) {
            phoneDirectory.put(name, receivedNumber);
        }
    }

    public void get(String name) {
        System.out.println(phoneDirectory.get(name));
    }

}
