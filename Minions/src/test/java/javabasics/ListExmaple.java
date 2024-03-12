package javabasics;

import java.util.ArrayList;
import java.util.List;

public class ListExmaple {

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<Integer>();
        l.add(23);
        l.add(56);

        System.out.println(l);

        l.add(78);

        System.out.println(l);

        l.add(45);

        System.out.println();

        l.add(67);
        l.add(45);

        for(int o:l){
            System.out.println(o);
        }

        System.out.println(l);

        System.out.println(l.get(4));

        List <String> d = new ArrayList<String>();
        d.add("aa");
        d.add("bb");
        d.add("aa");
        d.add("aa");
        System.out.println(d);
        System.out.println(d.get(0));

        for(String h:d){
            System.out.println(h);
        }


    }

}
