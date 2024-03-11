package javabasics;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {

        Map<Integer, String> m = new HashMap<Integer, String>();
        m.put(123,"aravinth");
        m.put(456,"sam");
        System.out.println(m);

        Map<String, String> m1 = new HashMap<String, String>();
        m1.put("envi","chrome");
        System.out.println(m1);

        System.out.println(m.get(123));

        System.out.println(m1.get("envi"));
    }
}
