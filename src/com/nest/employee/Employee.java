package com.nest.employee;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        int choice;
        String empName;
        ArrayList<String> emp=new ArrayList<>();

        while (true){
            System.out.println("***Select choice***");
            System.out.println("1.Add Employee");
            System.out.println("2.View Employee");
            System.out.println("3.Exit");
            Scanner s=new Scanner(System.in);
            choice=s.nextInt();

            switch (choice){
                case 1:

                    System.out.println("Enter the name of an Employee ");
                    empName=s.next();
                    emp.add(empName);

                    break;
                case 2:
                    if(emp.size()==0){
                        System.out.println("No Employee Added");
                    }
                    else {
                        System.out.println(emp);
                        }
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }
}
