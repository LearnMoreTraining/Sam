package javabasics;

public class ArrayExample {

    public static void main(String[] args) {

        int [] a = {45,23,12,100} ; //0,1,2,3 //size -4

        for(int k:a){
            System.out.println(k);
        }

        String [] j = {"aravinth","learnmore"}; //0,1

        for(String p:j){
            System.out.println(p);
        }

        System.out.println(j[1]);

        for(int b =0 ; b < j.length; b++){

            System.out.println(j[b]);
        }

//        System.out.println(a[3]);
//
//        System.out.println(j[1]);

        for(int k=0 ; k < a.length ; k++){

            System.out.println(a[k]);
        }

    }
}
