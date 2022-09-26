package com.nest.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int choice,p,q,a,s,m,d;
        while(true){

            System.out.println("!!!!Select Choice!!!!");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Divison");
            Scanner scanner=new Scanner(System.in);
            choice= scanner.nextInt();
            p=scanner.nextInt();
            q=scanner.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Addition Selected");
                    a=p+q;
                    System.out.println("Answer="+a);
                    break;
                case 2:
                    System.out.println("Substraction selected");
                    s=p-q;
                    System.out.println("Answer="+s);
                    break;
                case 3:
                    System.out.println("Multiplication selected");
                    m=p*q;
                    System.out.println("Answer="+m);
                    break;
                case 4:
                    System.out.println("Division selected");
                    d=p/q;
                    System.out.println("Answer="+d);
                    break;
                case 5:
                    System.exit(0);


            }

        }
    }
}