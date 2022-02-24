package code;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program is written by Harsh");
        System.out.println("1 : Addition");
        System.out.println("2 : Subtraction");
        System.out.println("3 : Multiplication");
        System.out.println("4 : Division");
        System.out.println("5 : Modulo Division");
        System.out.println("Enter your choice from above: ");
        int choice = sc.nextInt();
        System.out.println("Enter the value of A : ");
        int a = sc.nextInt();
        System.out.println("Enter the value of B : ");
        int b = sc.nextInt();
        switch (choice){
            case 1 :
                System.out.println(a+b);
                break;
            case 2 :
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println(a/b);
                break;
            case 5:
                System.out.println(a%b);
                break;
            default:
                System.out.println("Invalid output by user. ");
        }
    }
}


