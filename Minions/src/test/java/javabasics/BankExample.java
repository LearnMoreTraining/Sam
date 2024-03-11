package javabasics;

public class BankExample {

    public static void main(String[] args) {


        String role = "cashier" ;
        int noOfWorkingDays = 21;

        int salary = 0;

        if(role.equalsIgnoreCase("Manager")){

           salary =  noOfWorkingDays * 500 ;
        }
        else if(role.equalsIgnoreCase("Cashier")){

             salary =  noOfWorkingDays * 350 ;
        }
        else if (role.equalsIgnoreCase("clerk")){

             salary =  noOfWorkingDays * 250 ;
        }
        else{

            System.out.println("enter the valid role");
        }

        System.out.println(salary);


    }


}
