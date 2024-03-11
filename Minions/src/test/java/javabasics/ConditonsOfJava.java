package javabasics;

public class ConditonsOfJava {

    public static void main(String[] args) {

        int a = 450;
        int b = 45 ;

        if (a == b){

            System.out.println("equal");
        }

        else if(a < b){
            System.out.println("a is lesser");
        }
        else if(a > b){
            System.out.println("a is greater");
        }
        else{

            System.out.println("not equal");
        }


        String name = "aravinth";
        String name2 = "apple";

        if (name.equals(name2)){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }

    }


}
